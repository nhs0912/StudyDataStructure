class SelectSort {
    int[] numbers;
    int minNum = 0;

    SelectSort() {
        // Default Constructor
        //아주 최신 버전
    }

    SelectSort(int[] numbers) {// Get an array
        this.numbers = numbers;
    }

/*
    int findMinNum(int num) {
        // 제일 작은 수 구하기
        int i = num;
        this.minNum = numbers[i];
        for (; i < numbers.length; i++) {
            if (i < numbers.length - 1) {//마지막 두번째까지 검사하기
                if (minNum < numbers[i + 1]) {
                    //swap();
                    System.out.println(i);
                }
            } else {
                System.out.println(i);
            }
        }
        return 0;
    }

    void swap(int a, int b) {// 숫자바꾸기
        int tempNum = 0;
        tempNum = a;
        a = b;
        b = tempNum;
        numbers[a] = a;
        //numbers[]
    }
*/

    void execute() {
        // 선택정렬
        // 1) 제일 작은 수를 찾는다.
        // 2) 작은수가 있다면 제일 첫번째 위치랑 자리를 바꾼다.
        // 3) 1)과 2)를 계속 순환한다.

    }

    void display() {// show an array
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + " ,");
            }
        }
    }
}

public class Sort {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 4, 1, 3};
        SelectSort selection = new SelectSort(numbers);
        selection.execute();
        selection.display();


    }
}
