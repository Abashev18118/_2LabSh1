package org.example.animals;

public interface superRun {
    public default boolean superRun(String name)
         {
            System.out.println("Кот " + name+ " пробежал с экстра");
             int superRunCount=1;
             superRunCount--;
            return true;

        }
}
