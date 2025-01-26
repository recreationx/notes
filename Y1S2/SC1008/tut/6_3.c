#include <stdio.h>
#define BLANK ' '
void saveChar(void);

int main()
{
    printf("Enter your word and end it with a space = >");
    saveChar();
    putchar('\n');
    return 0;
}
void saveChar()
{
    char ch;
    ch = getchar();
    if (ch != BLANK)
        saveChar();
    else
        putchar('\n');
    putchar(ch);
}

// this prints whatever string u give it in reverse.
// getchar gets the last character in the input??
// it recursively calls itself. if the character is blank, it prints a new line character
// and exits the function