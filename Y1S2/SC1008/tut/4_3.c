#include <stdio.h>
#include <string.h>
#define INIT_VALUE 999

int stringcmp(char *s1, char *s2);

int main()
{
    char source[80], target[80], *p;
    int result = INIT_VALUE;
    printf("Enter a source string: \n");
    fgets(source, 80, stdin);
    if (p = strchr(source, '\n'))
        *p = '\0';
    printf("Enter a target string: \n");
    fgets(target, 80, stdin);
    if (p = strchr(target, '\n'))
        *p = '\0';
    result = stringcmp(source, target);
    if (result == 1)
        printf("stringcmp(): greater than");
    else if (result == 0)
        printf("stringcmp(): equal");
    else if (result == -1)
        printf("stringcmp(): less than");
    else
        printf("stringcmp(): error");
    return 0;
}

int stringcmp(char *s1, char *s2)
{
    int i = 0;
    int result = 0;
    while (s1[i] != '\0' && s2[i] != '\0') {
        if (s1[i] == s2[i]) {
            i++;

            if (s1[i] == '\0' && s2[i] != '\0') {
                result = -1;
            } else if (s1[i] != '\0' && s2[i] == '\0') {
                result = 1;
            }
            
            continue;
        } else if (s1[i] > s2[i]) {
            result = 1;
            break;
        } else if (s2[i] > s1[i]) {
            result = -1;
            break;
        }
    }
    return result;
}