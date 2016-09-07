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


    void execute() {
        // 선택정렬
        // 1) 제일 작은 수를 찾는다.
        // 2) 작은수가 있다면 제일 첫번째 위치랑 자리를 바꾼다.
        // 3) 1)과 2)를 계속 순환한다.

        int minNumIndex = 0; //최소값 인덱스
        int minNum = 0; //최소값

        for (int j = 0; j < numbers.length; j++) {

            //최소값 찾기
            minNum = numbers[j];
            for (int i = j; i < numbers.length - 1; i++) {
                if (minNum > numbers[i + 1]) {//minNum보다 작은 최솟값이 있으면 minNum에 대입한다.
                    minNum = numbers[i + 1];
                    minNumIndex = i + 1; //최소값의 주소값
                }
            }
            if (minNum != numbers[j]) {
                //최소값 != 자리값
                //자리를 바꿔준다.
                int tmp = numbers[j];
                numbers[j] = minNum;
                numbers[minNumIndex] = tmp;
            }
            //System.out.println("최솟값은 " + minNum + "입니다.");
            //System.out.println(j + "(값=" + numbers[j] + ")" + "번째 숫자와" + minNumIndex + "(값=" + numbers[minNumIndex] + ")" + "번째 숫자를 바꾸었습니다.");
            display();
        }
    }

    void display() {// show an array
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + " ,");
            }
        }
        System.out.println();
    }
}

public class Sort {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 4, 1, 3};

        SelectSort selection = new SelectSort(numbers);
        System.out.println("정렬 전");
        selection.display();
        System.out.println("정렬 후");
        selection.execute();


    }
}
