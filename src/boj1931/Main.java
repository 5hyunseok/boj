//package boj1931;
//
//import java.io.*;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.Vector;
//
//public class Main {
//
//  public static void main(String[] args) throws IOException {
//    InputStream in = System.in;
//    InputStreamReader reader = new InputStreamReader(in);
//    BufferedReader br = new BufferedReader(reader);
////    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
//
//    int n = Integer.parseInt(br.readLine());
//    Vector<Vector<Integer>> selected = new Vector<>();
//    Vector<Vector<Integer>> meetingTime = new Vector<>();
//
//    for(int i=0; i<n; i++){
//      String[] arg = br.readLine().split(" ");
//      Vector<Integer> temp = new Vector<>();
//      temp.add(Integer.parseInt(arg[0]));
//      temp.add(Integer.parseInt(arg[1]));
//      meetingTime.add(temp);
//    }
//
//    Collections.sort(meetingTime, new Comparator<Vector<Integer>>() {
//      @Override
//      public int compare(Vector<Integer> o1, Vector<Integer> o2) {
//        if(o1.get(1) - o2.get(1) == 0) return o1.get(0) - o2.get(0);
//        else return o1.get(1) - o2.get(1);
//      }
//    });
//
//    System.out.println(meetingTime);
//
//    int lastTime = 0;
//    for(int i=0; i<meetingTime.size(); i++){
//      Vector<Integer> v = meetingTime.get(i);
//      if(lastTime <= v.get(0)) {
//        lastTime = v.get(1);
//        selected.add(v);
//      }
//    }
//    System.out.println(selected.size());
//    }
//}
