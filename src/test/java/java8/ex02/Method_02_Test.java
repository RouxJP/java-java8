package java8.ex02;

import java.util.List;

import org.junit.Test;

import java8.data.Data;
import java8.data.Person;

/**
 * Exercice 02 - Redéfinition
 */
public class Method_02_Test {

    // tag::IDao[]
    interface IDao {
        List<Person> findAll();

  
        default String format() {
        	List<Person> lstPersone = findAll();
        	return "[" + lstPersone.size() + "]";
        }
        // créer une méthode String format()
        // la méthode retourne une chaîne de la forme [<nb_personnes> persons]
        // exemple de résultat : "[14 persons]", "[30 persons]"
    }
    // end::IDao[]

    // tag::DaoA[]
    class DaoA implements IDao {

        List<Person> people = Data.buildPersonList(20);

        @Override
        public List<Person> findAll() {
            return people;
        }

        public String format() {
           	String chaine = IDao.super.format();
            return "DaoA" + chaine + "persons";
        }


    }
    // end::DaoA[]

    @Test
    public void test_daoA_format() throws Exception {

        DaoA daoA = new DaoA();

        // TODO invoquer la méthode format() pour que le test soit passant
        String result = daoA.format();
        System.out.println(result);
        "DaoA[20 persons]".equals(result);
    }
}
