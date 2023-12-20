package org.example.animals;

public interface superRun {
    default boolean superRun(String name) {
        if (Human.superRunCount > 0) {
            System.out.println(name + " пробежал с экстра");
            return true;
        }
        else{
            System.out.println(name + " не может пробежать с экстра, так как исчерпал все возможности");
            return false;
        }
    }
}

