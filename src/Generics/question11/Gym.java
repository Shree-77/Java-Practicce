package Generics.question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * A member of a Gym is characterized by her/his mobile number,
 * name, age and the number of successful referrals made by
 * her/him to the Gym. Make an array list of member objects,
 * display information about the members using iterator, use
 * Comparator interface to compare two members based on a measure
 * (metric) defined by the sum of the number of successful referrals
 * and age, list the members in the collection in descending order
 * of the value of the metric and display the name of the member
 * with the minimum value of the metric.
 */
class Member {
    String name;
    int age;
    int successfulReferrals;
    int mobile_no;

    public Member(String name, int age, int successfulReferrals, int mobile_no) {
        this.name = name;
        this.age = age;
        this.successfulReferrals = successfulReferrals;
        this.mobile_no = mobile_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSuccessfulReferrals() {
        return successfulReferrals;
    }

    public void setSuccessfulReferrals(int successfulReferrals) {
        this.successfulReferrals = successfulReferrals;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

}

class Metric implements Comparator<Member> {

    @Override
    public int compare(Member o1, Member o2) {
        int metric1 = o1.age + o1.successfulReferrals;
        int metric2 = o2.age + o2.successfulReferrals;
        return metric2 - metric1;
    }

}

public class Gym {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("Shree", 21, 2, 123445));
        list.add(new Member("Batman", 35, 50, 25126));
        list.add(new Member("IronMan", 34, 20, 98275));

        System.out.println("UnSorted List");

        Iterator<Member> members = list.iterator();
        while (members.hasNext()) {
            System.out.println(members.next().name);
        }
        System.out.println("Sort by Metric");
        Collections.sort(list, new Metric());

        members = list.iterator();
        while (members.hasNext()) {
            Member member = members.next();
            System.out.println(member.name + " - Metric: " + (member.age + member.successfulReferrals));
        }
        Member minMetric = list.get(list.size() - 1);
        System.out.println("Minimum metric : " + minMetric.name);

    }
}
