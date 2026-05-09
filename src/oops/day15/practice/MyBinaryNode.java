package oops.day15.practice;

public class MyBinaryNode<K extends Comparable<K>>
implements INode<K> {

private K key;

private INode<K> left;

private INode<K> right;

// Constructor
public MyBinaryNode(K key) {

this.key = key;
}

// Getter and Setter Methods
@Override
public K getKey() {

return key;
}

@Override
public void setKey(K key) {

this.key = key;
}

@Override
public INode<K> getLeft() {

return left;
}

@Override
public void setLeft(INode<K> left) {

this.left = left;
}

@Override
public INode<K> getRight() {

return right;
}

@Override
public void setRight(INode<K> right) {

this.right = right;
}
}
