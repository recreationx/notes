#include <stdio.h>
#include <string.h>
struct student
{
    char name[20];    /* student name */
    double testScore; /* test score */
    double examScore; /* exam score */
    double total;     /* total = (testScore+examScore)/2 */
};
double average();
int main()
{
    printf("average(): %.2f\n", average());
    return 0;
}
double average()
{
    int studentCount = 0;
    struct student studentDB[50];
    while (studentCount < 50) {
        struct student studentRecord;

        char *p;
        printf("Enter student name:\n");
        fgets(studentRecord.name, 20, stdin);
        if (p = strchr(studentRecord.name, '\n')) {
            *p = '\0';
        }

        if (strcmp(studentRecord.name, "END") == 0) {
            break;
        }

        printf("Enter test score:\n");
        scanf("%lf", &studentRecord.testScore);

        printf("Enter exam score:\n");
        scanf("%lf", &studentRecord.examScore);

        while (getchar() != '\n');

        studentRecord.total = (studentRecord.testScore + studentRecord.examScore) / 2;
        printf("Student %s total = %.2lf\n", studentRecord.name, studentRecord.total);
        studentDB[studentCount] = studentRecord;

        studentCount++;
    }

    if (studentCount == 0) {
        return 0;
    }

    double sum = 0;
    for (int i = 0; i < studentCount; i++) {
        sum += studentDB[i].total;
    }

    return sum / studentCount;
}