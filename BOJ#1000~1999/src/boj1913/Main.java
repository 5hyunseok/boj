package boj1913;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        final int UP = 0;
        final int RIGHT = 1;
        final int DOWN = 2;
        final int LEFT = 3;

        int[][] direction = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        int n = Integer.valueOf(br.readLine());
        int targetNum = Integer.valueOf(br.readLine());
        int[][] snail = new int[n][n];

        int targetX = -1;
        int targetY = -1;

        int currentX = n/2;
        int currentY = n/2;
        int currentNum = 1;
        snail[currentX][currentY] = currentNum;
        for(int i=0; i<n/2; i++) {
            currentNum++;
            // 위로 1번
            currentX += direction[UP][0];
            currentY += direction[UP][1];
            snail[currentX][currentY] = currentNum;
            if(currentNum == targetNum) {
                targetX = currentX;
                targetY = currentY;
            }
            // 오른쪽 1 + 2(i+1) 번
            for(int j=0; j<(2*i + 1); j++) {
                currentNum++;
                currentX += direction[RIGHT][0];
                currentY += direction[RIGHT][1];
                snail[currentX][currentY] = currentNum;
                if(currentNum == targetNum) {
                    targetX = currentX;
                    targetY = currentY;
                }
            }
            // 아래로 2(i+1) 번
            for(int j=0; j<(2*(i+1)); j++) {
                currentNum++;
                currentX += direction[DOWN][0];
                currentY += direction[DOWN][1];
                snail[currentX][currentY] = currentNum;
                if(currentNum == targetNum) {
                    targetX = currentX;
                    targetY = currentY;
                }
            }
            // 왼쪽 2(i+1) 번
            for(int j=0; j<(2*(i+1)); j++) {
                currentNum++;
                currentX += direction[LEFT][0];
                currentY += direction[LEFT][1];
                snail[currentX][currentY] = currentNum;
                if(currentNum == targetNum) {
                    targetX = currentX;
                    targetY = currentY;
                }
            }
            // 위로 2(i+1) 번
            for(int j=0; j<(2*(i+1)); j++) {
                currentNum++;
                currentX += direction[UP][0];
                currentY += direction[UP][1];
                snail[currentX][currentY] = currentNum;
                if(currentNum == targetNum) {
                    targetX = currentX;
                    targetY = currentY;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(snail[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println((targetY+1) + " " + (targetX+1));
    }
}
