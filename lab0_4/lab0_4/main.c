#include <stdio.h>>
#include <time.h>

void delay(clock_t);
char Find_index(char*, int, char); // �迭���� �ش� ������ �ε��� ���� ã�Ƽ� ����
void print_Result(char,char,int); // ��� ���


void main() {
	char a[] = { 1, -1, 4, 9, 0, 4, 9, 6, -4, 5 }; 
	char b[] = { 5, 8, 2, 7, 8 };
	char Result_a;
	char Result_b;

	int Find_num; // ����ڿ��� �Է� ���� ����. ã�� ����.

	printf("lab0_4 : �𼳾�\n");

	printf("ã�� �������� �Է��ϼ��� : ");
	scanf("%d", &Find_num);

	Result_a = Find_index(a, Find_num, sizeof(a));
	Result_b = Find_index(b, Find_num, sizeof(b));

	print_Result(Result_a, Result_b,Find_num);

	delay(100000); // ��� ��� ������ ������
}

char Find_index(char* pArr, int Input, char Size) {
	char result = -1; // ���� ���� ��츦 ����� -1�� result���� �ʱ�ȭ

	for (int i = 0; i < Size; i++) {
		if (pArr[i] == Input) { // �迭�� �Է¹��� ������ �����ϸ� result�� �ش� �ε����� ����
			result = i;
			break;
		}
	}

	return result;
}

void print_Result(char a,char b,int Input) {
	if (a == -1) {
		printf("�迭 a���� %d(��)�� �������� �ʽ��ϴ�.\n",Input);
	}
	else {
		printf("�迭 a���� %d�� �ε��� : %d\n", Input, a);
	}

	if (b == -1) {
		printf("�迭 b���� %d(��)�� �������� �ʽ��ϴ�.\n", Input);
	}
	else {
		printf("�迭 b���� %d�� �ε��� : %d\n", Input, b);
	}
}

void delay(clock_t a) {
	clock_t start = clock();
	while (clock() - start <= a);
}