#include <stdio.h>
#include <stdarg.h>
/*
The function receives a fix argument 'count', that tell us how many 
numbers we should expect in the variadic arguments list.
*/
int variadic_sum(int count, ...)
{
    // 1. Declare an arguments list
    va_list args;
    int number;
    int total;

    // 2. Initialize the list. 'args' now points to the first variadic argument
    // that comes AFTER the argument 'count'.
    va_start(args, count);
    total = 0;
    // 3. Iterate over each argument in the list.
    for (int i = 0; i < count; i++)
    {
        // va_arg reads the value of the current argument as an 'int' and
        // advance the 'args' pointer to the next argument.
        number = va_arg(args, int);
        total += number;
    }
    // 4. Clean the arguments list. 
    va_end(args);
    return (total);
}

int main(void)
{
    printf("Sum of 1, 2, 3: %d\n", variadic_sum(3, 1, 2, 3));
    printf("Sum of 10, 20, 30, 40, 50: %d\n", variadic_sum(5, 10, 20, 30, 40, 50));
    printf("Sum of 2, -1: %d\n", variadic_sum(2, 2, -1));
}