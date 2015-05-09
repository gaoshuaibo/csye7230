/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import Business.AppointmentControl;
import Business.ConfigureControl;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author Alex
 */
public class DatabaseFactory {

    private static final String FILENAME = "DataBank.db4o"; // path to the data store
    private static DatabaseFactory databaseFactory;

    public synchronized static DatabaseFactory getInstance() {
        if (databaseFactory == null) {
            databaseFactory = new DatabaseFactory();
        }
        return databaseFactory;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(AppointmentControl.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(AppointmentControl system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public synchronized void storeSystem() {
        storeSystem(AppointmentControl.getInstance()); //default save the Business singleton
    }

    public AppointmentControl retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<AppointmentControl> systems = conn.query(AppointmentControl.class); // Change to the object you want to save
        AppointmentControl system;
        if (systems.size() == 0) {
            system = ConfigureControl.Initialize();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
            AppointmentControl.setAppointmentController(system);
            AppointmentControl.setIsFirstTimeRunning(false);
        }
        conn.close();
        return system;
    }
}
