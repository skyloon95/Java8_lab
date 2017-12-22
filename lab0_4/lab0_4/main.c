#include <stdio.h>>
#include <time.h>

void delay(clock_t);
char Find_index(char*, int, char); // 배열에서 해당 숫자의 인덱스 값을 찾아서 리턴
void print_Result(char,char,int); // 결과 출력


void main() {
	char a[] = { 1, -1, 4, 9, 0, 4, 9, 6, -4, 5 }; 
	char b[] = { 5, 8, 2, 7, 8 };
	char Result_a;
	char Result_b;

	int Find_num; // 사용자에게 입력 받을 변수. 찾는 정수.

	printf("lab0_4 : 모설아\n");

	printf("찾을 정수값을 입력하세요 : ");
	scanf("%d", &Find_num);

	Result_a = Find_index(a, Find_num, sizeof(a));
	Result_b = Find_index(b, Find_num, sizeof(b));

	print_Result(Result_a, Result_b,Find_num);

	delay(100000); // 결과 출력 유지용 딜레이
}

char Find_index(char* pArr, int Input, char Size) {
	char result = -1; // 값이 없을 경우를 대비해 -1로 result값을 초기화

	for (int i = 0; i < Size; i++) {
		if (pArr[i] == Input) { // 배열에 입력받은 정수가 존재하면 result에 해당 인덱스를 저장
			result = i;
			break;
		}
	}

	return result;
}

void print_Result(char a,char b,int Input) {
	if (a == -1) {
		printf("배열 a에는 %d(이)가 존재하지 않습니다.\n",Input);
	}
	else {
		printf("배열 a에서 %d의 인덱스 : %d\n", Input, a);
	}

	if (b == -1) {
		printf("배열 b에는 %d(이)가 존재하지 않습니다.\n", Input);
	}
	else {
		printf("배열 b에서 %d의 인덱스 : %d\n", Input, b);
	}
}

void delay(clock_t a) {
	clock_t start = clock();
	while (clock() - start <= a);
}