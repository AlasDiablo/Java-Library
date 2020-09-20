package fr.alasdiablo.lib.tuple;

import java.io.Serializable;
import java.util.Objects;

public class Couple<A, B> implements Serializable {

    private A left;
    private B right;

    public Couple(A left, B right) {
        this.left = left;
        this.right = right;
    }

    public Couple(Couple<A, B> couple) {
        this.left = couple.left;
        this.right = couple.right;
    }

    public A getLeft() {
        return left;
    }

    public void setLeft(A left) {
        this.left = left;
    }

    public B getRight() {
        return right;
    }

    public void setRight(B right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Couple<?, ?> couple = (Couple<?, ?>) o;
        return Objects.equals(getLeft(), couple.getLeft()) &&
                Objects.equals(getRight(), couple.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeft(), getRight());
    }
}
