package edu.epam.second.entity;

import edu.epam.second.Component;

import java.util.List;
import java.util.Objects;

public class Word implements Component {
    private String value;

    public Word(String string){
        value = string;
    }

    @Override
    public void operation() {
        System.out.print(value);
    }

    @Override
    public boolean add(Component component) {
        return false;
    }

    @Override
    public boolean addAll(List<? extends Component> component) {
        return false;
    }

    @Override
    public boolean remove(Component component) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Word word = (Word) o;
        return Objects.equals(value, word.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Word{" +
                "value='" + value + '\'' +
                '}';
    }
}
