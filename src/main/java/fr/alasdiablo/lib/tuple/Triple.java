package fr.alasdiablo.lib.tuple;

import java.io.Serializable;
import java.util.Objects;

public class Triple<A, B, C> implements Serializable {

    private A left;
    private B middle;
    private C right;

    public Triple(A left, B middle, C right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public Triple(Triple<A, B, C> triple) {
        this.left = triple.left;
        this.middle = triple.middle;
        this.right = triple.right;
    }

    public A getLeft() {
        return left;
    }

    public void setLeft(A left) {
        this.left = left;
    }

    public B getMiddle() {
        return middle;
    }

    public void setMiddle(B middle) {
        this.middle = middle;
    }

    public C getRight() {
        return right;
    }

    public void setRight(C right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "left=" + left +
                ", middle=" + middle +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
        return Objects.equals(getLeft(), triple.getLeft()) &&
                Objects.equals(getMiddle(), triple.getMiddle()) &&
                Objects.equals(getRight(), triple.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeft(), getMiddle(), getRight());
    }
}
