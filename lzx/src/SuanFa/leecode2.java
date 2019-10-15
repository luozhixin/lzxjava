package SuanFa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/12 10:03
 * @Description:
 */
public class leecode2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(8);  // 这是第一个链表的第一个节点(不能用这个节点去往下加数据)
        // 必须有一个指针去往第一个节点上去加数据
        ListNode p = l1;  // 这个指针节点会从链表的第一个节点一直往下走(直至最后一个节点)
        p.next = new ListNode(9);
        p = p.next;
        p.next = new ListNode(9);
        p = p.next;
//        p.next = new ListNode(6);


// 第二个链表
        ListNode l2 = new ListNode(2);
//        ListNode q = l2;
//        q.next = new ListNode(9);
//        q = q.next;
//        q.next = new ListNode(9);
//        q = q.next;
//        q.next = new ListNode(9);


        ListNode re = addTwoNumbers(l1, l2);
//        while(re != null) {
//            System.out.println(re.val);
//            re = re.next;
//        }

    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> list1 = new LinkedList<>();;
        LinkedList<Integer> list2 = new LinkedList<>();;
        LinkedList<Integer> list3 = new LinkedList<>();;
        while(l1!=null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2=l2.next;
        }
        int i;
        if(list1.size()>=list2.size()){
            i=list1.size();
        }else{
            i=list2.size();
        }
        for (int p = 0; p <=i; p++) {
            list3.add(0);
        }
        for (int j = 0; j <i ; j++) {
            if(j+1<= list1.size()&&j+1<= list2.size()){
                if(list3.get(j)+list1.get(j)+list2.get(j)>=10){
                    list3.set(j,list3.get(j)+list1.get(j)+list2.get(j)-10);
                    list3.set(j+1,1);
                }else {
                    list3.set(j,list1.get(j)+list2.get(j)+list3.get(j));
                }
                continue;
            }
            if(j+1>list1.size()&&j+1<= list2.size()){
                for (int l = j; l < i; l++) {
                    if(list3.get(l)+list2.get(l)>=10){
                        list3.set(l,list3.get(l)+list2.get(l)-10);
                        list3.set(l+1,1);
                    }else {
                        list3.set(l,list2.get(l)+list3.get(l));
                    }
                }
                break;
            }
            if(j+1<=list1.size()&&j+1>list2.size()){
                for (int l = j; l < i; l++) {
                    if(list3.get(l)+list1.get(l)>=10){
                        list3.set(l,list3.get(l)+list1.get(l)-10);
                        list3.set(l+1,1);
                    }else {
                        list3.set(l,list1.get(l)+list3.get(l));
                    }
                }
                break;
            }
        }
        if(list3.get(list3.size()-2)==10){
            list3.set(list3.size()-2,0);
            list3.set(list3.size()-1,1);
        }
        if(list3.getLast()==0){
            list3.pollLast();
        }
        int o=1;
        ListNode l3 = null;
        ListNode p = null;
        for (int j = 0; j <list3.size() ; j++) {
            if(o==1){

                l3 = new ListNode(list3.get(j));
                p = l3;
            }else{
                p.next=new ListNode(list3.get(j));
                p=p.next;

            }
            o++;
        }
            return l3;
    }
}
