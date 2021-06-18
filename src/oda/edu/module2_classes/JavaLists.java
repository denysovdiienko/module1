package oda.edu.module2_classes;/*

  @author   Denys Ovdiienko
  @project   oda.edu
  @class  JavaLists
  @version  1.0.0 
  @since 18.06.2021 - 19.03
*/
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class JavaLists {
    public static void main(String[] args) {
        Random random = new Random();
        int r1 = random.nextInt(1000);

        System.out.println("------------------LINKED LIST--------------------------------  ");
        List<Integer> linkedList = new LinkedList<>();
        int indexOfCenterL = linkedList.size() / 2;

        // CREATE LIST

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();

        int duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Create duration : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //----------------- INSERT-----------------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(indexOfCenterL, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        // TAIl

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() - 1, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the end  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //------------------UPDATE-----------------

        // HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(0, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        // MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(indexOfCenterL, random.nextInt(1000));
            indexOfCenterL++;
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 1, random.nextInt(1000));

        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //------------------DELETE-----------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());


        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(indexOfCenterL);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());


        System.out.println("------------------ARRAY LIST--------------------------------  ");
        List<Integer> arrayList = new ArrayList<>();
        int indexOfCenterA = arrayList.size() / 2;

        // CREATE LIST

        start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Create duration : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //----------------- INSERT-----------------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(indexOfCenterA, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        // TAIl

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() - 1, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the end  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //------------------UPDATE-----------------

        // HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(0, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        // MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(indexOfCenterA, random.nextInt(1000));
            indexOfCenterA++;
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 1, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //------------------DELETE-----------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());
        ;

        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(indexOfCenterA);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());
    }
}