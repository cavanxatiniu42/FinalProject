package software;


import domainapp.basics.apps.tool.DomainAppTool;
import domainapp.basics.exceptions.ApplicationRuntimeException;
import domainapp.basics.setup.Cmd;
import model.armors.Armors;
import model.armors.Chainmail;
import model.armors.Leather;
import model.armors.Robe;
import model.heros.Hero;
import model.heros.Mage;
import model.heros.Rogue;
import model.heros.Warrior;
import model.weapons.Axe;
import model.weapons.Bow;
import model.weapons.Staff;
import model.weapons.Weapons;

/**
 * @overview 
 *  Encapsulate the basic functions for setting up and running a software for the CourseMan domain model.  
 *  
 * @author dmle
 *
 * @version 
 */
public class CourseManSoftware {
  
  // CourseMan's domain model
  private static final Class[] model = {
          Hero.class,
          Armors.class,
          Weapons.class,
          Warrior.class,
          Axe.class,
          Chainmail.class,
          Mage.class,
          Rogue.class,
          Staff.class,
          Robe.class,
          Leather.class,
          Bow.class

  };
  
  public static void main(String[] args) {
    // 1: configure and run software
    //configure();
    
    // 2: run software
    run();
    
    //deleteDomainData(Student.class, City.class);
    
    //deleteDomainSchema(Enrolment.class);
    
    //createDomainSchema(Enrolment.class, Student.class, City.class, SClass.class);
    
    //deleteApplicationConfig();
  }

  /**
   * @effects 
   *  configure and run the software.
   *  
   *  <p>Throws ApplicationRuntimeException if an error occured.
   * 
   * @version 
   */
  private static void configure() throws ApplicationRuntimeException {
    DomainAppTool.runSetUp(Cmd.Configure, model);
  }
  
  /**
   * @effects 
   *  Run the software.
   *  
   *  <p>Throws ApplicationRuntimeException if an error occured.
   *  
   * @version 
   * 
   */
  private static void run() throws ApplicationRuntimeException {
    DomainAppTool.run(model);    
  }

  ////// Other set-up commands ///////
  /**
   * @effects 
   *  Delete domain data of the domain classes specified in <tt>domainClasses</tt>.
   *  
   *  <p>Throws ApplicationRuntimeException if an error occured.
   * 
   * @version 
   */
  private static void deleteDomainData(Class...domainClasses) throws ApplicationRuntimeException {
    if (domainClasses == null || domainClasses.length == 0)
      return;
    
    DomainAppTool.runSetUp(Cmd.DeleteDomainData, domainClasses);
  }
  
  /**
   * @effects 
   *  Delete domain schema of the domain classes specified in <tt>domainClasses</tt>.
   *  
   *  <p>Throws ApplicationRuntimeException if an error occured.
   * 
   * @version 
   */
  private static void deleteDomainSchema(Class...domainClasses) throws ApplicationRuntimeException {
    if (domainClasses == null || domainClasses.length == 0)
      return;
    
    DomainAppTool.runSetUp(Cmd.DeleteDomainSchema, domainClasses);    
  }

  /**
   * @effects 
   *  Create domain schema of the domain classes specified in <tt>domainClasses</tt>.
   *  
   *  <p>Throws ApplicationRuntimeException if an error occured.
   * 
   * @version 
   */
  private static void createDomainSchema(Class...domainClasses) throws ApplicationRuntimeException {
    if (domainClasses == null || domainClasses.length == 0)
      return;
    
    DomainAppTool.runSetUp(Cmd.CreateDomainSchema, domainClasses);    
  }

  /**
   * @effects 
   *  Delete application configuration
   *  
   *  <p>Throws ApplicationRuntimeException if an error occured.
   * 
   * @version 
   */
  private static void deleteApplicationConfig() throws ApplicationRuntimeException {
    DomainAppTool.runSetUp(Cmd.DeleteConfig);    
  }
}
