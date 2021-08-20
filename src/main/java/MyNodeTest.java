import org.junit.Assert;
import org.junit.Test;

/*Creating A linked list changing the position of the nodes and in sequence of 30,70,56*/
public class MyLinkedListTest {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode = new MyNode<>(30);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) &&  myLinkedList.head.getNext().equals(mySecondNode) &&  myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
