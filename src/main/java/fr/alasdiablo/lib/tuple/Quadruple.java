package fr.alasdiablo.lib.tuple;

import java.io.Serializable;
import java.util.Objects;

public class Quadruple<A, B, C, D> implements Serializable {
    private A left;
    private B middleLeft;
    private C middleRight;
    private D right;

    public Quadruple(A left, B middleLeft, C middleRight, D right) {
        this.left = left;
        this.middleLeft = middleLeft;
        this.middleRight = middleRight;
        this.right = right;
    }

    public Quadruple(Quadruple<A, B, C, D> quadruple) {
        this.left = quadruple.left;
        this.middleLeft = quadruple.middleLeft;
        this.middleRight = quadruple.middleRight;
        this.right = quadruple.right;
    }

    public A getLeft() {
        return left;
    }

    public void setLeft(A left) {
        this.left = left;
    }

    public B getMiddleLeft() {
        return middleLeft;
    }

    public void setMiddleLeft(B middle_left) {
        this.middleLeft = middle_left;
    }

    public C getMiddleRight() {
        return middleRight;
    }

    public void setMiddleRight(C middle_right) {
        this.middleRight = middle_right;
    }

    public D getRight() {
        return right;
    }

    public void setRight(D right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Quadruple{" +
                "left=" + left +
                ", middle_left=" + middleLeft +
                ", middle_right=" + middleRight +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadruple<?, ?, ?, ?> quadruple = (Quadruple<?, ?, ?, ?>) o;
        return Objects.equals(getLeft(), quadruple.getLeft()) &&
                Objects.equals(getMiddleLeft(), quadruple.getMiddleLeft()) &&
                Objects.equals(getMiddleRight(), quadruple.getMiddleRight()) &&
                Objects.equals(getRight(), quadruple.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeft(), getMiddleLeft(), getMiddleRight(), getRight());
    }
}
