#include <stdio.h>
#include <string.h>
#include <ctype.h>

void processString(char *str, int *totVowels, int *totDigits);

int main()
{
    char str[50], *p;
    int totVowels, totDigits;
    printf("Enter the string: \n");
    fgets(str, 50, stdin);
    if (p = strchr(str, '\n'))
        *p = '\0';
    processString(str, &totVowels, &totDigits);
    printf("Total vowels = %d\n", totVowels);
    printf("Total digits = %d\n", totDigits);
    return 0;
}
void processString(char *str, int *totVowels, int *totDigits)
{
    int count = 0;
    *totVowels = 0;
    *totDigits = 0;
    while (str[count] != '\0') {
        char ch = tolower(str[count]);
    
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            *totVowels += 1;
        }

        if (isdigit(ch)) {
            *totDigits += 1;
        }

        count += 1;
    }
    
}