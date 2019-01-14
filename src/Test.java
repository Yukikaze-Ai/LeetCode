import java.util.*;

public class Test {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		//l1=342
		//l2=465
		ListNode temp = l1;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(3);
		temp=l2;
		temp.next = new ListNode(6);
		temp = temp.next;
		temp.next = new ListNode(4);
		// l1=9999999991
		/*
		ListNode temp = l1;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(9);*/
		// l2=2
		/*
		 * temp=l2; temp.next=new ListNode(2); temp=temp.next; temp.next =new
		 * ListNode(4);
		 */

		sumUp4(l1, l2);

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode sumUp4(ListNode l1, ListNode l2) {

		int carry = 0;
		int val=l1.val+l2.val;
		if (val>=10)
		{
			carry=1;
			val=val %10;
		}
		ListNode result = new ListNode(val);
		l1=l1.next;
		l2=l2.next;
		ListNode tmp = result;

		
		
		while (l1 != null && l2 != null) {
				val=l1.val+l2.val+carry;
				if (val>=10)
				{
					carry=1;
					val=val %10;
				}else
				{
					carry=0;
				}
				tmp.next = new ListNode(val);
				tmp = tmp.next;
				
				l1=l1.next;
				l2=l2.next;
		}
		if(l1==null&l2==null&&carry==0)
		{
			return result;
		}
		if(l1==null&l2==null&&carry!=0)
		{
			tmp.next = new ListNode(carry);
			tmp = tmp.next;
		}
		if(l1==null&&l2!=null)
		{
			while(l2!=null)
			{
				val=l2.val+carry;
				if (val>=10)
				{
					carry=1;
					val=val %10;
				}else
				{
					carry=0;
				}
				tmp.next = new ListNode(val);
				tmp = tmp.next;
				l2=l2.next;
			}if(l2==null&&carry==1)
			{
				tmp.next = new ListNode(carry);
				tmp = tmp.next;
			}
		}
		if(l2==null&&l1!=null)
		{
			while(l1!=null)
			{
				val=l1.val+carry;
				if (val>=10)
				{
					carry=1;
					val=val %10;
				}else
				{
					carry=0;
				}
				tmp.next = new ListNode(val);
				tmp = tmp.next;
				l1=l1.next;
			}
			if(l1==null&&carry==1)
			{
				tmp.next = new ListNode(carry);
				tmp = tmp.next;
			}
		}
		return result;

	}

}
