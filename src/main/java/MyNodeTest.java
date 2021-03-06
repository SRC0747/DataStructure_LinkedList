import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    public void given3NumbersWhenLinkShouldPassedLinkedListTest(){
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}

@Test
/*Creating A linked list changing the position of the nodes and in sequence of 70,30,56*/
public class MyLinkedListTest {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) &&  myLinkedList.head.getNext().equals(mySecondNode) &&  myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}

@Test
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

@Test
/*Inserting 30 between 56 and 70.*/
public class MyLinkedListTest {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
@Test
/*Delete the first element of the Linked List in 56,30,70 Sequence.*/
public class MyLinkedListTest {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}

@Test
/*Delete the Last element of the Linked List in 56,30,70 Sequence.*/
public class MyLinkedListTest {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();
        myLinkedList.popLast();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}

@Test
/*Search the Element 30 from the Linked List.*/
public class MyLinkedListTest {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();
        myLinkedList.popLast();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        myLinkedList.searchNode(30);
        Assert.assertTrue(result);
    }
}

@Test
/*Inserting 40 in the linked List of Sequence 56,30,70*/
public class given4NumbersAddedToLinkedListFromTop {
    public void given3NumbersWhenLinkShouldPassedLinkedListTest(){
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(40);
        MyNode<Integer> myFourthNode = new MyNode(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myThirdNode.setNext(myFourthNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLiinkedList.insert(mySecondNode,myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode) && myFirstNode.getNext().getNext().getNext().equals(myFourthNode);
        Assert.assertTrue(result);
    }
}

@Test
/*Deleting 40 in the linked List of Sequence 56,30,70*/
public class delete40FromLinkedList{
    public class delete40FromLinkedList {
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(40);
        MyNode<Integer> myFourthNode = new MyNode(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myThirdNode.setNext(myFourthNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLiinkedList.insert(mySecondNode,myThirdNode);
        myLinkedList.deleteFromMid(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode) && myFirstNode.getNext().getNext().getNext().equals(myFourthNode);
        Assert.assertTrue(result);
    }
}


@Test
/*Sorting the Linked List in Ascending Order*/
public class SortAscendingOrderLinkedListFromTop {
    public class sortAscendingOrderLinkedListFromTop {
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(40);
        MyNode<Integer> myFourthNode = new MyNode(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myThirdNode.setNext(myFourthNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLiinkedList.insert(mySecondNode,myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode) && myFirstNode.getNext().getNext().getNext().equals(myFourthNode);
        nyLinkedList.sortLinkedListAscendingOrder();
        Assert.assertTrue(result);
    }
}
