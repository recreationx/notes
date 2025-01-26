#include <stdio.h>

int main() {
    while (1) {
        printf("Enter Student ID:\n");
        int student_id;
        int mark;
        scanf("%d", &student_id);

        if (student_id == -1) {
            return 0;
        }

        printf("Enter Mark:\n");
        scanf("%d", &mark);

        if (mark >= 75) {
            printf("A\n");
        } else if (mark >= 65) {
            printf("B\n");
        } else if (mark >= 55) {
            printf("C\n");
        } else if (mark >= 45) {
            printf("D\n");
        } else if (mark >= 0) {
            printf("F\n");
        }
        
    }

}