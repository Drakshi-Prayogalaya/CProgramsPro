package com.grape.cprogramspro;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class explist extends ActionBarActivity
{
    Button b1;

    static String program1 = "// 1. Sorting the array of structures\n"+
            "\n"+
                    "#include<stdio.h>\n"+
                    "#define M 50\n"+
                    " \n"+
                    "struct state {\n"+
                    "   char name[50];\n"+
                    "   long int population;\n"+
                    "   float literacyRate;\n"+
                    "   float income;\n"+
                    "} st[M]; /* array of structure */\n"+
                    " \n"+
                    "int main() {\n"+
                    "   int i, n, ml, mi, maximumLiteracyRate, maximumIncome;\n"+
                    "   float rate;\n"+
                    "   ml = mi = -1;\n"+
                    "   maximumLiteracyRate = maximumIncome = 0;\n"+
                    " \n"+
                    "   printf(\"Enter how many states:\");\n"+
                    "   scanf(\"%d\", &n);\n"+
                    " \n"+
                    "   for (i = 0; i < n; i++) {\n"+
                    "      printf(\"\\nEnter state %d details :\", i);\n"+
                    " \n"+
                    "      printf(\"\\nEnter state name : \");\n"+
                    "      scanf(\"%s\", &st[i].name);\n"+
                    " \n"+
                    "      printf(\"\\nEnter total population : \");\n"+
                    "      scanf(\"%ld\", &st[i].population);\n"+
                    " \n"+
                    "      printf(\"\\nEnter total literary rate : \");\n"+
                    "      scanf(\"%f\", &rate);\n"+
                    "      st[i].literacyRate = rate;\n"+
                    " \n"+
                    "      printf(\"\\nEnter total income : \");\n"+
                    "      scanf(\"%f\", &st[i].income);\n"+
                    "   }\n"+
                    " \n"+
                    "   for (i = 0; i < n; i++) {\n"+
                    "      if (st[i].literacyRate >= maximumLiteracyRate) {\n"+
                    "         maximumLiteracyRate = st[i].literacyRate;\n"+
                    "         ml++;\n"+
                    "      }\n"+
                    "      if (st[i].income > maximumIncome) {\n"+
                    "         maximumIncome = st[i].income;\n"+
                    "         mi++;\n"+
                    "      }\n"+
                    "   }\n"+
                    " \n"+
                    "   printf(\"\\nState with highest literary rate :%s\", st[ml].name);\n"+
                    "   printf(\"\\nState with highest income :%s\", st[mi].name);\n"+
                    " \n"+
                    "   return (0);\n"+
                    "}\n"+
                    "\n";

    static String program2 = "// 2. Sum of two arrays using Dynamic Memory Allocation\n"+
            "#include <stdio.h>\n"+
            "#include <alloc.h>\n"+
            "#include <stdlib.h>\n"+
            "void main() {\n"+
            "	int i,n;\n"+
            "	int *a,*b,*c;\n"+
            "	printf(\"How many Elements in each array...\\n\");\n"+
            "	scanf(\"%d\", &n);\n"+
            "	a = (int *) malloc(n*sizeof(int));\n"+
            "	b = (int *) malloc(n*sizeof(int));\n"+
            "	c =( int *) malloc(n*sizeof(int));\n"+
            "	printf(\"Enter Elements of First List\\n\");\n"+
            "	for (i=0;i<n;i++) \n" +
            "   {\n"+
            "		scanf(\"%d\",a+i);\n"+
            "	}\n"+
            "	printf(\"Enter Elements of Second List\\n\");\n"+
            "	for (i=0;i<n;i++) \n " +
            "   {\n"+
            "		scanf(\"%d\",b+i);\n"+
            "	}\n"+
            "	for (i=0;i<n;i++) \n"+
            "   {\n"+
            "		*(c+i) = *(a+i) + *(b+i);\n"+
            "	}\n"+
            "	printf(\"Resultant List is\\n\");\n"+
            "	for (i=0;i<n;i++)\n" +
            "   {\n"+
            "		printf(\"%d\\n\",*(c+i));\n"+
            "	}\n"+
            "}\n"+
            "\n";

    static String program3 = "// 3. Stack PUSH & POP implementation using Arrays\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            "#define MAX 5\n"+
            "int top, status;\n"+
            "/*PUSH FUNCTION*/\n"+
            "void push (int stack[ ], int item) {\n"+
            "	if (top == (MAX-1))\n"+
            "		status = 0; else {\n"+
            "		status = 1;\n"+
            "		++top;\n"+
            "		stack [top] = item;\n"+
            "	}\n"+
            "}\n"+
            "/*POP FUNCTION*/\n"+
            "int pop (int stack[ ]) {\n"+
            "	int ret;\n"+
            "	if (top == -1)" +
            "    {\n"+
            "		ret = 0;\n"+
            "		status = 0;\n"+
            "	} " +
            "   else " +
            "   {\n"+
            "		status = 1;\n"+
            "		ret = stack [top];\n"+
            "		- -top;\n"+
            "	}\n"+
            "	return ret;\n"+
            "}\n"+
            "/*FUNCTION TO DISPLAY STACK*/\n"+
            "void display (int stack[ ]) {\n"+
            "	int i;\n"+
            "	printf (\"\\nThe Stack is: \");\n"+
            "	if (top == -1)\n"+
            "		printf (\"empty\");\n" +
            "   else {\n"+
            "		for (i=top; i>=0; - -i)\n"+
            "	        printf (\"\\n--------\\n  %3d \\n--------\",stack[i]);\n"+
            "	}\n"+
            "	printf (\"\\n\");\n"+
            "}\n"+
            "/*MAIN PROGRAM*/\n"+
            "void main() {\n"+
            "	int stack [MAX], item;\n"+
            "	int ch;\n"+
            "	clrscr ();\n"+
            "	top = -1;\n"+
            "	do {\n"+
            "		do " +
            "       {\n"+
            "			printf (\"\\nMAIN MENU\");\n"+
            "			printf (\"\\n1.PUSH (Insert) in the Stack\");\n"+
            "			printf (\"\\n2.POP  (Delete) from the Stack\");\n"+
            "			printf (\"\\n3.Exit (End the Execution)\");\n"+
            "			printf (\"\\nEnter Your Choice: \");\n"+
            "			scanf  (\"%d\", &ch);\n"+
            "			if (ch<1 || ch>3)\n"+
            "				       printf (\"\\nInvalid Choice, Please try again\");\n"+
            "		}\n"+
            "		while (ch<1 || ch>3);\n"+
            "		switch (ch) {\n"+
            "			case 1:\n"+
            "			        printf (\"\\nEnter the Element to be pushed : \");\n"+
            "			        scanf  (\"%d\", &item);\n"+
            "			        printf (\" %d\", item);\n"+
            "			        push (stack, item);\n"+
            "			        if (status) {\n"+
            "			        printf (\"\\nAfter Pushing \");\n"+
            "			        display (stack);\n"+
            "			if (top == (MAX-1))\n"+
            "			        printf (\"\\nThe Stack is Full\");\n"+
            "			else\n"+
            "			        printf (\"\\nStack overflow on Push\");\n"+
            "			break;\n\n"+
            "			case 2:\n"+
            "			        item = pop (stack);\n"+
            "			        if (status) {\n"+
            "				            printf (\"\\nThe Popped item is %d.  After Popping: \");\n"+
            "				            display (stack);\n"+
            "			        else\n"+
            "					     printf (\"\\nStack underflow on Pop\");\n"+
            "			break;\n\n"+
            "			default:\n"+
            "					printf (\"\\nEND OF EXECUTION\");\n"+
            "		}\n"+
            "	}\n"+
            "	while (ch != 3);\n"+
            "	getch();\n"+
            "}\n";

    static String program4 = "// 4. To remove duplicate element in an array\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "   int a[20],i,j,k,n;\n"+
            "   clrscr();\n"+
            " \n"+
            "   printf(\"\\nEnter array size : \");\n"+
            "   scanf(\"%d\",&n);\n"+
            " \n"+
            "   printf(\"\\nEnter %d array element : \",n);\n"+
            "   for(i=0;i< n;i++)\n"+
            "           scanf(\"%d\",&a[i]);\n"+
            " \n"+
            "   printf(\"\\nOriginal array is : \");\n"+
            "   for(i=0;i< n;i++)\n"+
            "           printf(\" %d\",a[i]);\n"+
            " \n"+
            "   printf(\"\\nNew array is  : \");\n"+
            "   for(i=0;i< n;i++)\n"+
            "   {\n"+
            "           for(j=i+1;j< n;)\n"+
            "           {\n"+
            "                   if(a[j]==a[i])\n"+
            "                   {\n"+
            "                           for(k=j;k< n;k++)\n"+
            "                                   a[k]=a[k+1];\n"+
            "                           n- -;\n"+
            "                   }\n"+
            "                   else\n"+
            "                           j++;\n"+
            "           }\n"+
            "}\n"+
            " \n"+
            "for(i=0;i< n;i++)\n"+
            "    printf(\"%d \",a[i]);\n"+
            "getch();\n"+
            "}\n"+
            "\n";

    static String program5 = "// 5. To sort the matrix rows and columns\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "void main () {\n"+
            "	static int ma[10][10],mb[10][10];\n"+
            "	int i,j,k,a,m,n;\n"+
            "	printf (\"Enter the order of the matrix \\n\");\n"+
            "	scanf (\"%d %d\", &m,&n);\n"+
            "	printf (\"Enter co-efficients of the matrix \\n\");\n"+
            "	for (i=0;i<m;++i) {\n"+
            "		for (j=0;j<n;++j) {\n"+
            "			scanf (\"%d\",&ma[i][j]);\n"+
            "			mb[i][j] = ma[i][j];\n"+
            "		}\n"+
            "	}\n"+
            "	printf (\"The given matrix is \\n\");\n"+
            "	for (i=0;i<m;++i) {\n"+
            "		for (j=0;j<n;++j) {\n"+
            "			printf (\" %d\",ma[i][j]);\n"+
            "		}\n"+
            "		printf (\"\\n\");\n"+
            "	}\n"+
            "	printf (\"After arranging rows in ascending order\\n\");\n"+
            "	for (i=0;i<m;++i) {\n"+
            "		for (j=0;j<n;++j) {\n"+
            "			for (k=(j+1);k<n;++k) {\n"+
            "				if (ma[i][j] > ma[i][k]) {\n"+
            "					a = ma[i][j];\n"+
            "					ma[i][j] = ma[i][k];\n"+
            "					ma[i][k] = a;\n"+
            "				}\n"+
            "			}\n"+
            "		}\n"+
            "	}\n"+
            "	/* End of outer for loop*/\n"+
            "	for (i=0;i<m;++i) {\n"+
            "		for (j=0;j<n;++j) {\n"+
            "			printf (\" %d\",ma[i][j]);\n"+
            "		}\n"+
            "		printf (\"\\n\");\n"+
            "	}\n"+
            "	printf (\"After arranging the columns in descending order \\n\");\n"+
            "	for (j=0;j<n;++j) {\n"+
            "		for (i=0;i<m;++i) {\n"+
            "			for (k=i+1;k<m;++k) {\n"+
            "				if (mb[i][j] < mb[k][j]) {\n"+
            "					a = mb[i][j];\n"+
            "					mb[i][j] = mb[k][j];\n"+
            "					mb[k][j] = a;\n"+
            "				}\n"+
            "			}\n"+
            "		}\n"+
            "	}\n"+
            "	/* End of outer for loop*/\n"+
            "	for (i=0;i<m;++i) {\n"+
            "		for (j=0;j<n;++j) {\n"+
            "			printf (\" %d\",mb[i][j]);\n"+
            "		}\n"+
            "		printf (\"\\n\");\n"+
            "	}\n"+
            "}\n"+
            "\n";

    static String program6 = "// 6. Program to swapping of two arrays\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main() \n" +
            "{\n"+
            "	int a[10],b[10],c[10],i;\n"+
            "	printf(\"Enter First array->\");\n"+
            "	for (i=0;i<10;i++)\n"+
            "	  scanf(\"%d\",&a[i]);\n"+
            "	printf(\"\\nEnter Second array->\");\n"+
            "	for (i=0;i<10;i++)\n"+
            "	  scanf(\"%d\",&b[i]);\n"+
            "	printf(\"Arrays before swapping\\n\");\n"+
            "	printf(\"\\nFirst array->\");\n"+
            "	for (i=0;i<10;i++)\n" +
            "   {\n"+
            "		printf(\"%d\",a[i]);\n"+
            "	}\n"+
            "	printf(\"\\nSecond array->\");\n"+
            "	for (i=0;i<10;i++)\n" +
            "   {\n"+
            "		printf(\"%d\",b[i]);\n"+
            "	}\n"+
            "	for (i=0;i<10;i++)\n" +
            "   {\n"+
            "		//write any swapping technique\n"+
            "		c[i]=a[i];\n"+
            "		a[i]=b[i];\n"+
            "		b[i]=c[i];\n"+
            "	}\n"+
            "	printf(\"\\nArrays after swapping\");\n"+
            "	printf(\"\\nFirst array->\");\n"+
            "	for (i=0;i<10;i++)\n" +
            "   {\n"+
            "		printf(\"%d\",a[i]);\n"+
            "	}\n"+
            "	printf(\"\\nSecond array->\");\n"+
            "	for (i=0;i<10;i++)\n" +
            "   {\n"+
            "		printf(\"%d\",b[i]);\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";

    static  String program7 = "// 7. Read name and marks of students and store it in a file\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "int main()\n" +
            "{\n"+
            "	char name[50];\n"+
            "	int marks,i,n;\n"+
            "	printf(\"Enter number of students: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	FILE *fptr;\n"+
            "	fptr=(fopen(\"C:\\student.txt\",\"w\"));\n"+
            "	if(fptr==NULL) {\n"+
            "		printf(\"Error!\");\n"+
            "		exit(1);\n"+
            "	}\n"+
            "	for (i=0;i<n;++i) {\n"+
            "		printf(\"For student%d\\nEnter name: \",i+1);\n"+
            "		scanf(\"%s\",name);\n"+
            "		printf(\"Enter marks: \");\n"+
            "		scanf(\"%d\",&marks);\n"+
            "		fprintf(fptr,\"\\nName: %s \\nMarks=%d \\n\",name,marks);\n"+
            "	}\n"+
            "	fclose(fptr);\n"+
            "	return 0;\n"+
            "}\n";

    static String program8 = "// 8. Find the maximum number in an array\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "max(int [ ],int);\n"+
            "void main()\n"+
            "{\n"+
            "	int a[ ]={10,5,45,12,19};\n"+
            "	int n=5,m;\n"+
            "	clrscr();\n"+
            "	m=max(a,n);\n"+
            "	printf(\"\\nMAXIMUM NUMBER IS %d\",m);\n"+
            "	getch();\n"+
            "}\n"+
            "max(int x[ ],int k)\n"+
            "{\n"+
            "	int t,i;\n"+
            "	t=x[0];\n"+
            "	for(i=1;i<k;i++)\n"+
            "   {\n"+
            "		if(x[i]>t)\n"+
            "			t=x[i];\n"+
            "	}\n"+
            "	return(t);\n"+
            "}\n"+
            "\n";



    static String program9 = "// 9. Operation on array\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "#include <math.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int a[10],i,n=5;\n"+
            "	float mean,temp,var,sd,sum=0.0;\n"+
            "	clrscr();\n"+
            "	for(i=0;i<n;i++)\n"+
            "   {\n"+
            "		printf(\"\\nENTER NUMBER-%d: \",i+1);\n"+
            "		scanf(\"%d\",&a[i]);\n"+
            "		sum=sum+a[i];\n"+
            "	}\n"+
            "	mean=sum/n;\n"+
            "	sum=0.0;\n"+
            "	for(i=0;i<n;i++)\n"+
            "   {\n"+
            "		temp=a[i]-mean;\n"+
            "		sum=sum+(temp*temp);\n"+
            "	}\n"+
            "	var=sum/n;\n"+
            "	sd=sqrt(var);\n"+
            "	printf(\"\\nMEAN = %0.2f\",mean);\n"+
            "	printf(\"\\nVARIANCE = %0.2f\",var);\n"+
            "	printf(\"\\nSTANDARD DAVIATION = %0.2f\",sd);\n"+
            "	getch();\n"+
            "}\n";



    static String program10 ="// 10. To insert a given number in the array\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int a[5],i,j=5,k,val,pos;\n"+
            "	clrscr();\n"+
            "	for(i=0;i<5;i++)\n"+
            "   {\n"+
            "		printf(\"\\nENTER NUMBER-%d: \",i+1);\n"+
            "		scanf(\"%d\",&a[i]);\n"+
            "	}\n"+
            "	printf(\"\\nENTER VALUE TO INSERT: \");\n"+
            "	scanf(\"%d\",&val);\n"+
            "	printf(\"\\nENTER POSITION TO INSERT: \");\n"+
            "	scanf(\"%d\",&pos);\n"+
            "	j++;\n"+
            "	for(k=j;k>=pos;k- -)\n"+
            "   {\n"+
            "		a[k]=a[k-1];\n"+
            "	}\n"+
            "	a[- -pos]=val;\n"+
            "	printf(\"\\nTHE ARRAY IS: \");\n"+
            "	for(i=0;i<j;i++)\n"+
            "   {\n"+
            "		printf(\"%d\t\",a[i]);\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program11 ="// 11. Highest and lowest number in array\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int val[5],h,l,i;\n"+
            "	clrscr();\n"+
            "	for(i=0;i<5;i++)\n"+
            "   {\n"+
            "		printf(\"\\nENTER VALUE-%d: \",i+1);\n"+
            "		scanf(\"%d\",&val[i]);\n"+
            "	}\n"+
            "	l=val[0];\n"+
            "	h=val[0];\n"+
            "	for(i=0;i<5;i++)\n"+
            "   {\n"+
            "		if(val[i]>h)\n"+
            "			h=val[i];\n"+
            "		else\n"+
            "       {\n"+
            "			if(val[i]<l)\n"+
            "				l=val[i];\n"+
            "		}\n"+
            "	}\n"+
            "	printf(\"\\nHIGHEST VALUE IS %d\",h);\n"+
            "	printf(\"\\nLOWEST VALUE IS %d\",l);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program12 ="// 12. Average of array elements\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int age[10],i ;\n"+
            "	float avg,sum=0.0;\n"+
            "	clrscr();\n"+
            "	for(i=0;i<10;i++)\n"+
            "   {\n"+
            "		printf(\"\\nENTER AGE-%d: \",i+1);\n"+
            "		scanf(\"%d\",&age[i]);\n"+
            "		sum=sum+age[i];\n"+
            "	}\n"+
            "	printf(\"\\nINPUT AGES ARE: \");\n"+
            "	for(i=0;i<10;i++)\n"+
            "		printf(\"%d \",age[i]);\n"+
            "	avg=sum/10;\n"+
            "	printf(\"\\nTHE AVERAGE AGE IS: %0.2f\",avg);\n"+
            "	getch();\n"+
            "}\n";



    static String program13 ="// 13. To Create an array in C\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int a[5];\n"+
            "	int i,n=5;\n"+
            "	clrscr();\n"+
            "	for(i=0;i<n;i++)\n"+
            "	{\n"+
            "		printf(\"\\nENTER THE NUMBER-%d: \",i+1);\n"+
            "		scanf(\"%d\",&a[i]);\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "        printf(\"ARRAY ELEMENT-%d: VALUE=%d, ADDRESS=%u\\n\",i+1,a[i],&a[i]);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program14 ="// 14. Initializing an array in declaration\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#define SIZE 12\n"+
            " \n"+
            "int main()\n"+
            "{\n"+
            "   int a[ SIZE ] = { 1, 3, 5, 4, 7, 2, 99, 16, 45, 67, 89, 45 };\n"+
            "   int i; \n"+
            "   int total = 0; \n"+
            "   \n"+
            "   for ( i = 0; i < SIZE; i++ )\n" +
            "   {\n"+
            "      total += a[ i ];\n"+
            "   } \n"+
            " \n"+
            "   printf( \"Total of array element values is %d\\n\", total );\n"+
            "   return 0; \n"+
            " \n"+
            "}\n"+
            "\n";



    static String program15 ="// 15. Initializing an array using \"for\" loop\n"+
            "\n"+
            "#include <stdio.h>\n"+
            " \n"+
            "int main()\n"+
            "{\n"+
            "   int n[ 10 ]; \n"+
            "   int i; \n"+
            "   \n"+
            "   /* initialize elements of array n to 0 */\n"+
            "   for ( i = 0; i < 10; i++ )\n" +
            "   {\n"+
            "      n[ i ] = 0;\n"+
            "   }\n"+
            "   \n"+
            "   printf( \"%s%13s\\n\", \"Element\", \"Value\" );\n"+
            " \n"+
            "   for ( i = 0; i < 10; i++ )\n" +
            "   {\n"+
            "      printf( \"%7d%13d\\n\", i, n[ i ] );\n"+
            "   } \n"+
            " \n"+
            "   return 0;\n"+
            " \n"+
            "}\n"+
            "\n";



    static String program16 ="// 16. Use \"scanf\" to read data into array\n"+
            "\n"+
            "#include <stdio.h>\n"+
            " \n"+
            "int main(void)\n"+
            "{\n"+
            "  int numbers[10];\n"+
            "  int count = 10;\n"+
            "  long sum = 0L;\n"+
            "  float average = 0.0f;\n"+
            " \n"+
            "  printf(\"\\nEnter the 10 numbers:\\n\");\\n"+
            "  int i;\n"+
            " \n"+
            "  for(i = 0; i < count; i ++)\n"+
            "  {\n"+
            "    printf(\"%2d> \",i+1);\n"+
            "    scanf(\"%d\", &numbers[i]);\n"+
            "    sum += numbers[i];\n"+
            "  }\n"+
            " \n"+
            "  average = (float)sum/count;\n"+
            " \n"+
            "  printf(\"\\nAverage of the ten numbers entered is: %f\\n\", average);\n"+
            "  return 0;\n"+
            "}\n"+
            "\n";



    static String program17 ="// 17. Get Address of an array using Arrays and Pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            " \n"+
            "int main(void)\n"+
            "{\n"+
            "  char multiple[ ] = \"My string\";\n"+
            " \n"+
            "  char *p = &multiple[0];\n"+
            "  printf(\"\\nThe address of the first array element  : %u\\n\", p);\n"+
            " \n"+
            "  p = multiple;\n"+
            "  printf(\"\\nThe address obtained from the array name: %u\\n\", p);\n"+
            " \n"+
            "  return 0;\n"+
            "}\n"+
            "\n";



    static String program18 ="// 18. Accessing an array using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            " \n"+
            "int main()\n" +
            "{\n"+
            "   int a[5];\n"+
            "   int i;\n"+
            "   for(i = 0;i<5;i++)\n" +
            "   {\n"+
            "       a[i]=i;\n"+
            "   }\n"+
            " \n"+
            "   int *b;  \n"+
            "   \n"+
            "   b=a;     \n"+
            "   for(i = 0;i<5;i++)\n" +
            "   {\n"+
            "       printf(\"value in array is %d and address is %16lu\\n\",*b,b);\n"+
            "       b=b+2;\n"+
            "   }\n"+
            "}\n"+
            "\n";



    static String program19 ="// 19. Merging of two sorted lists\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            " \n"+
            "void sort(int *,int);\n"+
            "void merge(int *,int *,int *,int);\n"+
            " \n"+
            "void main(){\n"+
            "   int a[5],b[5],c[10];\n"+
            "   a[0] = 2;\n"+
            "   a[1] = 3;\n"+
            "   a[2] = 6;\n"+
            "   a[3] = 1;\n"+
            "   a[4] = 8;\n"+
            " \n"+
            "   b[0] = 0;\n"+
            "   b[1] = 2;\n"+
            "   b[2] = 8;\n"+
            "   b[3] = 7;\n"+
            "   b[4] = 5;\n"+
            " \n"+
            "   sort(a,5);\n"+
            "   printf(\"The sorted list a is:\\n\");\n"+
            "   int j;\n"+
            "   for(j=0;j<5;j++)\n"+
            "      printf(\"%d \\n\",a[j]);\n"+
            " \n"+
            " \n"+
            "   sort(b,5);\n"+
            "   printf(\"The sorted list b is:\\n\");\n"+
            "   for(j=0;j<5;j++)\n"+
            "      printf(\"%d \\n\",b[j]);\n"+
            " \n"+
            "   merge(a,b,c,5);\n"+
            "   printf(\"The elements of merged list are \\n\");\n"+
            " \n"+
            "   for(j=0;j<10;j++)\n"+
            "      printf(\"%d \\n\",c[j]);\n"+
            "}\n"+
            "void sort(int arr[ ] ,int k)\n"+
            "{\n"+
            "   int temp;\n"+
            "   int i,j;\n"+
            "   for(i=0;i<k;i++)\n " +
            "   {\n"+
            "      for(j=0;j<k-i-1;j++)\n" +
            "      {\n"+
            "         if(arr[j]<arr[j+1])\n"+
            "         {\n"+
            "            temp=arr[j];\n"+
            "            arr[j]=arr[j+1];\n"+
            "            arr[j+1]=temp;\n"+
            "         }\n"+
            "      }\n"+
            "   }\n"+
            "}\n"+
            "void merge(int a[ ],int b[ ],int c[ ],int k)\n" +
            "{\n"+
            "   int indexA=0,indexB=0,indexC=0;\n"+
            "   while(indexA<k && indexB<k)\n" +
            "   {\n"+
            "      if(a[indexA] < b[indexB])\n" +
            "      {\n"+
            "            c[indexC]=a[indexA];\n"+
            "         indexA++;\n"+
            "      }\n" +
            "      else " +
            "      {\n"+
            "         c[indexC]=b[indexB];\n"+
            "         indexB++;\n"+
            "      }\n"+
            "      indexC++;\n"+
            "   }\n"+
            "   while(indexA<k)\n"+
            "   {\n"+
            "      c[indexC]=a[indexA];\n"+
            "      indexA++;indexC++;\n"+
            "   }\n"+
            "   while(indexB<k)\n"+
            "   {\n"+
            "      c[indexC]=b[indexB];\n"+
            "      indexB++;  indexC++;\n"+
            "   }\n"+
            "}\n"+
            "\n";



    static String program20 ="// 20. Inverse of the list\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            "void read(int *,int);\n"+
            "void dis(int *,int);\n"+
            "void inverse(int *,int);\n"+
            " \n"+
            "main(){\n"+
            " \n"+
            "   int a[5],i;\n"+
            " \n"+
            "   read(a,5);\n"+
            "   dis(a,5);\n"+
            "   inverse(a,5);\n"+
            "   dis(a,5);\n"+
            "   getch();\n"+
            "}\n"+
            " \n"+
            "void read(int c[ ],int i)\n"+
            "{\n"+
            "   int j;\n"+
            "   printf(\"Enter the list \\n\");\n"+
            "   for(j=0;j<i;j++)\n"+
            "      scanf(\"%d\",&c[j]);\n"+
            "   fflush(stdin);\n"+
            "}\n"+
            "void dis(int d[ ],int i)\n"+
            "{\n"+
            "   int j;\n"+
            "   printf(\"The list is \\n\");\n"+
            "   for(j=0;j<i;j++)\n"+
            "      printf(\"%d \",d[j]);\n"+
            "   printf(\"\\n\");\n"+
            "}\n"+
            "void inverse(int inver_a[ ],int j)\n"+
            "{\n"+
            "   int i,temp;\n"+
            "   j- -;\n"+
            "   for(i=0;i<(j/2);i++)\n"+
            "   {\n"+
            "      temp=inver_a[i];\n"+
            "      inver_a[i]=inver_a[j];\n"+
            "      inver_a[j]=temp;\n"+
            "      j- -;\n"+
            "   }\n"+
            "}\n"+
            "\n";



    static String program21 ="// 21. Addition of the elements of the list\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            " \n"+
            "void main()\n"+
            "{\n"+
            "   int a[5],i = 5,sum=0;\n"+
            " \n"+
            "   printf(\"Enter the elements of list \\n\");\n"+
            "   int j;\n"+
            "   for(j=0;j<i;j++)\n"+
            "     scanf(\"%d\",&a[j]);\n"+
            "   fflush(stdin);\n"+
            "   printf(\"The list elements are \\n\");\n"+
            " \n"+
            "   for(j=0;j<i;j++)\n"+
            "      printf(\"%d \",a[j]);\n"+
            "   printf(\"\\n\");\n"+
            "   for(i=0;i<5;i++)\n"+
            "   {\n"+
            "      sum+=a[i];\n"+
            "   }\n"+
            "   printf(\"The sum of the elements of the list is %d\\n\",sum);\n"+
            "}\n"+
            "\n";



    static String program22 ="// 22. Address of each element in an array\n"+
            "\n"+
            "#include <stdio.h>\n"+
            " \n"+
            "main()\n"+
            "{\n"+
            "    int a[5];\n"+
            "    int i;\n"+
            "    for(i = 0;i<5;i++)\n"+
            "    {\n"+
            "        a[i]=i;\n"+
            "    }\n"+
            " \n"+
            "    for(i = 0;i<5;i++)\n"+
            "    {\n"+
            "        printf(\"value in array %d\\n\",a[i]);\n"+
            "    }\n"+
            " \n"+
            "    for(i = 0;i<5;i++)\n"+
            "    {\n"+
            "        printf(\"value in array %d and address is %16lu\\n\",a[i],&a[i]);\n"+
            "    }\n"+
            "}\n"+
            "\n";



    static String program23 ="// 23. Arrays of strings\n"+
            "\n"+
            "#include <stdio.h>\n"+
            " \n"+
            "int main(void)\n"+
            "{\n"+
            "  char str[ ][40] =  { \"asdf\",\"fdsa\"};\n"+
            "  int strLength[ ] = {0, 0};\n"+
            "  int i;\n"+
            "  for(i = 0 ; i<2 ; i++){\n"+
            "    while (str[i][strLength[i]])\n"+
            "      strLength[i]++;\n"+
            "  }\n"+
            " \n"+
            "  if(sizeof str[0] < strLength[0] + strLength[1] + 1)\n" +
            "  {\n"+
            "    printf(\"\\nNo enough space\");\n"+
            "  }\n" +
            "  else{\n"+
            "    strLength[1] = 0;\n"+
            "    while((str[0][strLength[0]++] == str[1][strLength[1]++]));\n"+
            "    printf(\"\\n%s\\n\", str[0]);\n"+
            "  }\n"+
            "  return 0;\n"+
            "}\n"+
            "\n";



    static String program24 ="// 24. To convert binary to octal\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#define MAX 1000\n"+
            "int main() {\n"+
            "	char octalNumber[MAX];\n"+
            "	long int i=0;\n"+
            "	printf(\"Enter any octal number: \");\n"+
            "	scanf(\"%s\",octalNumber);\n"+
            "	printf(\"Equivalent binary value: \");\n"+
            "	while(octalNumber[i])\n" +
            "   {\n"+
            "		switch(octalNumber[i]) {\n"+
            "			case \'0\':\n" +
            "                   printf(\"000\");\n"+
            "			        break;\n"+
            "			case \'1\':\n" +
            "                   printf(\"001\");\n"+
            "			        break;\n"+
            "			case \'2\': \n" +
            "                   printf(\"010\");\n"+
            "			        break;\n"+
            "			case \'3\': " +
            "                   printf(\"011\");\n"+
            "			        break;\n"+
            "			case \'4\': \n" +
            "                   printf(\"100\");\n"+
            "			        break;\n"+
            "			case \'5\':\n" +
            "                   printf(\"101\");\n"+
            "			        break;\n"+
            "			case \'6\':\n" +
            "                   printf(\"110\");\n"+
            "			        break;\n"+
            "			case \'7\': \n" +
            "                   printf(\"111\");\n"+
            "			        break;\n"+
            "			default:\n" +
            "                   printf(\"\\nInvalid octal digit %c \",octalNumber[i]);\n"+
            "			        return 0;\n"+
            "		}\n"+
            "		i++;\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program25 ="// 25. To convert decimal to hexadecimal\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main() {\n"+
            "	long int decimalNumber,remainder,quotient;\n"+
            "	int i=1,j,temp;\n"+
            "	char hexadecimalNumber[100];\n"+
            "	printf(\"Enter any decimal number: \");\n"+
            "	scanf(\"%ld\",&decimalNumber);\n"+
            "	quotient = decimalNumber;\n"+
            "	while(quotient!=0) {\n"+
            "		temp = quotient % 16;\n"+
            "		//To convert integer into character\n"+
            "		if( temp < 10)\n"+
            "		    temp =temp + 48;\n" +
            "       else\n"+
            "		    temp = temp + 55;\n"+
            "		hexadecimalNumber[i++]= temp;\n"+
            "		quotient = quotient / 16;\n"+
            "	}\n"+
            "	printf(\"Equivalent hexadecimal value of decimal number %d: \",decimalNumber);\n"+
            "	for (j = i -1 ;j> 0;j- -)\n"+
            "	      printf(\"%c\",hexadecimalNumber[j]);\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program26 ="// 26. Decimal to Octal conversion\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main() {\n"+
            "	long int decimalNumber,remainder,quotient;\n"+
            "	int octalNumber[100],i=1,j;\n"+
            "	printf(\"Enter any decimal number: \");\n"+
            "	scanf(\"%ld\",&decimalNumber);\n"+
            "	quotient = decimalNumber;\n"+
            "	while(quotient!=0) {\n"+
            "		octalNumber[i++]= quotient % 8;\n"+
            "		quotient = quotient / 8;\n"+
            "	}\n"+
            "	printf(\"Equivalent octal value of decimal number %d: \",decimalNumber);\n"+
            "	for (j = i -1 ;j> 0;j- -)\n"+
            "	      printf(\"%d\",octalNumber[j]);\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program27 ="// 27. To convert decimal to binary in c\n"+
            "\n"+
            "#include\n"+
            "int main() {\n"+
            "	long int decimalNumber,remainder,quotient;\n"+
            "	int binaryNumber[100],i=1,j;\n"+
            "	printf(\"Enter any decimal number: \");\n"+
            "	scanf(\"%ld\",&decimalNumber);\n"+
            "	quotient = decimalNumber;\n"+
            "	while(quotient!=0) {\n"+
            "		binaryNumber[i++]= quotient % 2;\n"+
            "		quotient = quotient / 2;\n"+
            "	}\n"+
            "	printf(\"Equivalent binary value of decimal number %d: \",decimalNumber);\n"+
            "	for (j = i -1 ;j> 0;j- -)\n"+
            "	         printf(\"%d\",binaryNumber[j]);\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program28 ="// 28. Binary to Decimal conversion\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	unsigned long num;\n"+
            "	int digit,i,pos=0,pow=1,dec=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A BINARY NUMBER: \");\n"+
            "	scanf(\"%lu\",&num);\n"+
            "	printf(\"\\nDECIMAL EQUIVALENT OF %lu IS \",num);\n"+
            "	while(num!=0)\n"+
            "	{\n"+
            "		pow=1;\n"+
            "		digit=num%10;\n"+
            "		num=num/10;\n"+
            "		for(i=1;i<=pos;i++)\n"+
            "			pow=pow*2;\n"+
            "		pos++;\n"+
            "		dec=dec+(pow*digit);\n"+
            "	}\n"+
            "	printf(\"%d\",dec);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program29 ="//29. Decimal to Hexadecimal conversion\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	unsigned long dec;\n"+
            "	int a[25],c=0,i;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A DECIMAL NUMBER: \");\n"+
            "	scanf(\"%lu\",&dec);\n"+
            "	printf(\"\\n%lu IN HEXADECIMAL FORMAT: \",dec);\n"+
            "	while(dec>0)\n"+
            "	{\n"+
            "		a[c]=dec%16;\n"+
            "		dec=dec/16;\n"+
            "		c++;\n"+
            "	}\n"+
            "	for(i=c-1;i>=0;i- -)\n"+
            "	{\n"+
            "		if(a[i]>=10)\n"+
            "			printf(\"%c\",a[i]+55);\n"+
            "		else\n"+
            "			printf(\"%d\",a[i]);\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program30 ="// 30. Decimal to Binary conversion\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	unsigned long dec;\n"+
            "	int a[25],c=0,i;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A DECIMAL NUMBER: \");\n"+
            "	scanf(\"%lu\",&dec);\n"+
            "	printf(\"\\n%lu IN BINARY FORMAT: \",dec);\n"+
            "	while(dec>0)\n"+
            "	{\n"+
            "		a[c]=dec%2;\n"+
            "		dec=dec/2;\n"+
            "		c++;\n"+
            "	}\n"+
            "	for(i=c-1;i>=0;i- -)\n"+
            "		printf(\"%d\",a[i]);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program31 ="// 31. To find the sum of a H.P.\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            "void main() {\n"+
            "	int n;\n"+
            "	float i, sum, t;\n"+
            "	printf(\"1+1/2+1/3+......+1/n\\n\");\n"+
            "	printf(\"Enter the value of n\\n\");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	sum=0;\n"+
            "	for (i=1;i<=n;i++) {\n"+
            "		t=1/i;\n"+
            "		sum=sum+t;\n"+
            "	}\n"+
            "	printf(\"%f\",sum);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program32 ="// 32. To find the sum of a G.P.\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<math.h>\n"+
            "int main() {\n"+
            "	float a,r,i,tn;\n"+
            "	int n;\n"+
            "	float sum=0;\n"+
            "	printf(\"Enter the first number of the G.P: \");\n"+
            "	scanf(\"%f\",&a);\n"+
            "	printf(\"Enter the total numbers in the G.P: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	printf(\"Enter the common ratio of G.P: \");\n"+
            "	scanf(\"%f\",&r);\n"+
            "	sum = (a*(1 - pow(r,n+1)))/(1-r);\n"+
            "	tn = a * (1 -pow(r,n-1));\n"+
            "	printf(\"tn term of G.P.: %f\",tn);\n"+
            "	printf(\"\\nSum of the G.P.: %f\",sum);\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program33 ="// 33. To find the sum of given A.P.\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<math.h>\n"+
            "int main() {\n"+
            "	int a,d,n,i,tn;\n"+
            "	int sum=0;\n"+
            "	printf(\"Enter the first number of the A.P: \");\n"+
            "	scanf(\"%d\",&a);\n"+
            "	printf(\"Enter the total numbers in the A.P: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	printf(\"Enter the common difference of A.P: \");\n"+
            "	scanf(\"%d\",&d);\n"+
            "	sum = ( n * ( 2 * a + ( n -1 ) * d ) )/ 2;\n"+
            "	tn = a + (n-1) * d;\n"+
            "	printf(\"Sum of the series A.P.: \");\n"+
            "	for (i=a;i<=tn; i= i + d )\n" +
            "   {\n"+
            "		if (i != tn)\n"+
            "	        printf(\"%d + \",i);\n" +
            "       else\n"+
            "		    printf(\"%d = %d \",i,sum);\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program34 ="//34. To find the sum of series 1^3 + 2^3 +.......+ n^3\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<math.h>\n"+
            "int main() {\n"+
            "	int n,i;\n"+
            "	int sum=0;\n"+
            "	printf(\"Enter the n i.e. max values of series: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	sum = pow(((n * (n + 1) ) / 2),2);\n"+
            "	printf(\"Sum of the series : \");\n"+
            "	for (i =1;i<=n;i++)\n" +
            "   {\n"+
            "		if (i != n)\n"+
            "	        printf(\"%d^3 + \",i);\n" +
            "       else\n"+
            "		    printf(\"%d^3 = %d \",i,sum);\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program35 ="//35. To find the sum of series 1^2 + 2^2 +........+ n^2\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main() {\n"+
            "	int n,i;\n"+
            "	int sum=0;\n"+
            "	printf(\"Enter the n i.e. max values of series: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	sum = (n * (n + 1) * (2 * n + 1 )) / 6;\n"+
            "	printf(\"Sum of the series : \");\n"+
            "	for (i =1;i<=n;i++) {\n"+
            "		if (i != n)\n"+
            "		    printf(\"%d^2 + \",i);" +
            "       else\n"+
            "		    printf(\"%d^2 = %d \",i,sum);\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program36 ="// 36. To find the sum of series 1 + 2 +........+ n\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main() \n" +
            "{\n"+
            "	int n,i;\n"+
            "	int sum=0;\n"+
            "	printf(\"Enter the n i.e. max values of series: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	sum = (n * (n + 1)) / 2;\n"+
            "	printf(\"Sum of the series: \");\n"+
            "	for (i =1;i <= n;i++) {\n"+
            "		if (i!=n)\n"+
            "		    printf(\"%d + \",i);\n" +
            "       else\n"+
            "		    printf(\"%d = %d \",i,sum);\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n"+
            "\n";



    static String program37 ="// 37. To print series using function\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int num=9,i;\n"+
            "	clrscr();\n"+
            "	printf(\"%d \",num);\n"+
            "	for(i=4;i<=10;i++)\n"+
            "	{\n"+
            "		num=num+pow(2,i);\n"+
            "		printf(\"%d \",num);\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n"+
            "pow(int a,int b)\n"+
            "{\n"+
            "	int prod=1,j;\n"+
            "	for(j=1;j<=b;j++)\n"+
            "		prod=prod*a;\n"+
            "	return(prod);\n"+
            "}\n"+
            "\n";



    static String program38 ="// 38. To print Fibonacci Series\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main(){\n"+
            " \n"+
            "    int i,range;\n"+
            "    long int arr[40];\n"+
            " \n"+
            "    printf(\"Enter the number range: \");\n"+
            "    scanf(\"%d\",&range);\n"+
            " \n"+
            "    arr[0]=0;\n"+
            "    arr[1]=1;\n"+
            " \n"+
            "    for(i=2;i<range;i++){\n"+
            "         arr[i] = arr[i-1] + arr[i-2];\n"+
            "    }\n"+
            " \n"+
            "    printf(\"Fibonacci series is: \");\n"+
            "    for(i=0;i<range;i++)\n"+
            "         printf(\"%ld \",arr[i]);\n"+
            "  \n"+
            "    return 0;\n"+
            "}\n"+
            "\n";



    static String program39 ="// 39. Use of Switch Case\n"+
            "\n"+
            "#include <conio.h>\n"+
            "#include <stdio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int i;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&i);\n"+
            "	switch(i)\n"+
            "   {\n"+
            "		case 1:\n"+
            "			printf(\"\\nNUMBER IS ONE\");\n"+
            "			break;\n"+
            "		case 2:\n"+
            "			printf(\"\\nNUMBER IS TWO\");\n"+
            "			break;\n"+
            "		case 3:\n"+
            "			printf(\"\\nNUMBER IS THREE\");\n"+
            "			break;\n"+
            "		default:\n"+
            "           printf(\"\\nNUMBER IS OTHER THAN ONE, TWO OR THREE\");\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program40 ="// 40. simple calculator using switch statement\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int num1,num2,opt;\n"+
            "	clrscr();\n"+
            "	printf(\"Enter the first Integer:\\n\");\n"+
            "	scanf(\"%d\",&num1);\n"+
            "	printf(\"Enter the second Integer:\\n\");\n"+
            "	scanf(\"%d\",&num2);\n"+
            "	for(;;)\n"+
            "	{\n"+
            "		printf(\"\\nEnter the your option:\\n\");\n"+
            "		printf(\"1-Addition.\\n2-Subtraction.\\n3-Multiplication.\\n4-Division.\\n5-Exit.\n\");\n"+
            "		scanf(\"%d\",&opt);\n"+
            "		switch(opt)\n"+
            "		{\n"+
            "			case 1:\n"+
            "                   printf(\"\\nAddition of  %d and %d is: %d\",num1,num2,num1+num2);\n"+
            "			        break;\n"+
            "			case 2:\n"+
            "                   printf(\"\\nSubstraction of %d  and %d is:  %d\",num1,num2,num1-num2);\n"+
            "			        break;\n"+
            "			case 3:\n"+
            "                   printf(\"\\nMultiplication of %d  and %d is:  %d\",num1,num2,num1*num2);\n"+
            "			        break;  \n"+
            "			case 4: \n"+
            "			        if(num2==0)\n"+
            "			        {\n"+
            "				            printf(\"Oops Divide by zero\\n\");\n"+
            "			        }\n"+
            "			        else\n"+
            "			        {\n"+
            "				            printf(\"\\n Division of %d  and %d is:  %d\",num1,num2,num1/num2);\n"+
            "			        }  \n"+
            "			        break;\n"+
            "			case 5:\n"+
            "                   return 0;\n"+
            "			        break; \n"+
            "			default:\n" +
            "                   printf(\"\\n Enter correct option\\n\");\n"+
            "			        break; \n"+
            "		}\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program41 ="// 41. Menu Driven Program using switch statement\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<conio.h>\n"+
            "void main () {\n"+
            "	int ch,r,l,w,b,h;\n"+
            "	float area;\n"+
            "	clrscr();\n"+
            "	printf(\"enter 1 for area of circle\\n\");\n"+
            "	printf(\"enter 2 for area of rectangle\\n\");\n"+
            "	printf(\"enter 3 for area of triangle\\n\");\n"+
            "	printf(\"enter your choice\n\");\n"+
            "	scanf(\"%d\",&ch);\n"+
            "	switch(ch)\n" +
            "   {\n"+
            "		case 1:\n"+
            "		    printf(\"enter radius of circle\\n\");\n"+
            "		    scanf(\"%d\",&r);\n"+
            "		    area=3.14*r*r;\n"+
            "		    break;\n"+
            "		case 2:\n"+
            "		    printf(\"enter length and width\\n\");\n"+
            "		    scanf(\"%d%d\",&l,&w);\n"+
            "		    area=l*w;\n"+
            "		    break;\n"+
            "		case 3:\n"+
            "           printf(\"enter the base and height\\n\");\n"+
            "		    scanf(\"%d%d\",&b,&h);\n"+
            "		    area=.5*b*h;\n"+
            "		    break;\n"+
            "	}\n"+
            "	printf(\"area is=%f\",area);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program42 ="// 42. Check given string is palindrome or not\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main() {\n"+
            "	char *a;\n"+
            "	int i,len,flag=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A STRING: \");\n"+
            "	gets(a);\n"+
            "	len=strlen(a);\n"+
            "	for (i=0;i<len;i++)\n" +
            "   {\n"+
            "		if(a[i]==a[len-i-1])\n"+
            "		     flag=flag+1;\n"+
            "	}\n"+
            "	if(flag==len)\n"+
            "	             printf(\"\\nTHE STRING IS PALINDROME\");\n" +
            "   else\n"+
            "	             printf(\"\\nTHE STRING IS NOT PALINDROME\");\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program43 ="// 43. Code which produces itself as output\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main()\n" +
            "{\n"+
            "    FILE *fp;\n"+
            "    char c;\n"+
            "    fp = fopen(__FILE__,\"r\");\n"+
            " \n"+
            "    do{\n"+
            "         c= getc(fp);\n"+
            "         putchar(c);\n"+
            "    }while(c!=EOF);\n"+
            "    fclose(fp);\n"+
            "    return 0;\n"+
            "}\n"+
            "\n";



    static String program44 ="// 44. To print \"Hello world\" without using semicolon\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "void main()\n"+
            "{\n"+
            "    if(printf(\"Hello world\"))\n"+
            "	{\n"+
            "	\n"+
            "    }\n"+
            "}\n";



    static String program45 ="// 45. Find Factorial Of A Number\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main(){\n"+
            "  int i,f=1,num;\n"+
            " \n"+
            "  printf(\"Enter a number: \");\n"+
            "  scanf(\"%d\",&num);\n"+
            " \n"+
            "  for(i=1;i<=num;i++)\n"+
            "      f=f*i;\n"+
            " \n"+
            "  printf(\"Factorial of %d is: %d\",num,f);\n"+
            "  return 0;\n"+
            "}\n"+
            "\n";



    static String program46 ="// 46. Solving quadratic equation\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "#include<math.h>\n"+
            " \n"+
            "int main()\n" +
            "{\n"+
            "  float a,b,c;\n"+
            "  float d,root1,root2;  \n"+
            " \n"+
            " \n"+
            "  printf(\"Enter a, b and c of quadratic equation: \");\n"+
            "  scanf(\"%f%f%f\",&a,&b,&c);\n"+
            "   \n"+
            "  d = b * b - 4 * a * c;\n"+
            "  \n"+
            "  if(d < 0){\n"+
            "    printf(\"Roots are complex numbers.\\n\");\n"+
            " \n"+
            "    printf(\"Roots of quadratic equation are: \");\n"+
            "    printf(\"%.3f%+.3fi\",-b/(2*a),sqrt(-d)/(2*a));\n"+
            "    printf(\", %.3f%+.3fi\",-b/(2*a),-sqrt(-d)/(2*a));\n"+
            "  \n"+
            "    return 0; \n"+
            "  }\n"+
            "  else if(d==0)\n" +
            "  {\n"+
            "   printf(\"Both roots are equal.\\n\");\n"+
            "   \n"+
            "   root1 = -b /(2* a);\n"+
            "   printf(\"Root of quadratic equation is: %.3f \",root1);\n"+
            " \n"+
            "   return 0;\n"+
            "  }\n"+
            "  else" +
            "  {\n"+
            "   printf(\"Roots are real numbers.\\n\");\n"+
            "  \n"+
            "   root1 = ( -b + sqrt(d)) / (2* a);\n"+
            "   root2 = ( -b - sqrt(d)) / (2* a);\n"+
            "   printf(\"Roots of quadratic equation are: %.3f , %.3f\",root1,root2);\n"+
            "  }\n"+
            " \n"+
            "  return 0;\n"+
            "}\n"+
            "\n";



    static String program47 ="// 47. To print the Pascal triangle\n"+
            "\n"+
            "#include<stdio.h>\n"+
            " \n"+
            "long fact(int);\n"+
            "int main(){\n"+
            "    int line,i,j;\n"+
            " \n"+
            "    printf(\"Enter the no. of lines: \");\n"+
            "    scanf(\"%d\",&line);\n"+
            " \n"+
            "    for(i=0;i<line;i++)\n" +
            "    {\n"+
            "         for(j=0;j<line-i-1;j++)\n"+
            "             printf(\" \");\n"+
            " \n"+
            "         for(j=0;j<=i;j++)\n"+
            "             printf(\"%ld \",fact(i)/(fact(j)*fact(i-j)));\n"+
            "         printf(\"\\n\");\n"+
            "    }\n"+
            "    return 0;\n"+
            "}\n"+
            " \n"+
            "long fact(int num){\n"+
            "    long f=1;\n"+
            "    int i=1;\n"+
            "    while(i<=num)" +
            "    {\n"+
            "         f=f*i;\n"+
            "         i++;\n"+
            "    }\n"+
            "  return f;\n"+
            " }\n"+
            " \n";



    static String program48 =" // 48. Printing ASCII value\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main(){\n"+
            " \n"+
            "  int i;\n"+
            "  \n"+
            "    for(i=0;i<=255;i++)\n"+
            "         printf(\"ASCII value of character %c: %d\\n\",i,i);\n"+
            " \n"+
            "    return 0;\n"+
            "}\n"+
            "\n";



    static String program49 ="// 49. Find power of a number using recursion\n"+
            "\n"+
            "#include<stdio.h>\n"+
            "int main() {\n"+
            "	int pow,num;\n"+
            "	long int res;\n"+
            "	long int power(int,int);\n"+
            "	printf(\"\\nEnter a number: \");\n"+
            "	scanf(\"%d\",&num);\n"+
            "	printf(\"\\nEnter power: \");\n"+
            "	scanf(\"%d\",&pow);\n"+
            "	res=power(num,pow);\n"+
            "	printf(\"\\n%d to the power %d is: %ld\",num,pow,res);\n"+
            "	return 0;\n"+
            "}\n"+
            "int i=1;\n"+
            "long int sum=1;\n"+
            "long int power(int num,int pow) {\n"+
            "	if(i<=pow) {\n"+
            "		sum=sum*num;\n"+
            "		power(num,pow-1);\n"+
            "	} else\n"+
            "	      return sum;\n"+
            "}\n"+
            "\n";



    static String program50 ="// 50. Find the maximum number using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int n,*p,i,h=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nHOW MANY NUMBERS: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	p=(int *) malloc(n*2);\n"+
            "	if(p==NULL)\n"+
            "	{\n"+
            "		printf(\"\\nMEMORY ALLOCATION UNSUCCESSFUL\");\n"+
            "		exit();\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "	{\n"+
            "		printf(\"\\nENTER NUMBER %d: \",i+1);\n"+
            "		scanf(\"%d\",(p+i));\n"+
            "	}\n"+
            "	h=*p;\n"+
            "	for(i=1;i<n;i++)\n"+
            "	{\n"+
            "		if(*(p+i)>h)\n"+
            "			h=*(p+i);\n"+
            "	}\n"+
            "	printf(\"\\nTHE HIGHEST NUMBER IS %d\",h);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program51 ="// 51. To find the average of n numbers using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int n,*p,sum=0,i;\n"+
            "	float avg;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nHOW MANY NUMBERS: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	p=(int *) malloc(n*2);\n"+
            "	if(p==NULL)\n"+
            "	{\n"+
            "		printf(\"\\nMEMORY ALLOCATION UNSUCCESSFUL\");\n"+
            "		exit();\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "	{\n"+
            "		printf(\"\\nENTER NUMBER %d: \",i+1);\n"+
            "		scanf(\"%d\",(p+i));\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "		sum=sum+*(p+i);\n"+
            "	avg=(float)sum/n;\n"+
            "	printf(\"\\nTHE AVERAGE OF THE NUMBERS IS %0.2f\",avg);\n"+
            "	getch();\n"+
            "}\n";



    static String program52 ="// 52. To check a number is prime or not using function\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int num,res=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&num);\n"+
            "	res=prime(num);\n"+
            "	if(res==0)\n"+
            "		printf(\"\\n%d IS A PRIME NUMBER\",num);\n"+
            "	else\n"+
            "		printf(\"\\n%d IS NOT A PRIME NUMBER\",num);\n"+
            "	getch();\n"+
            "}\n"+
            "int prime(int n)\n"+
            "{\n"+
            "	int i;\n"+
            "	for(i=2;i<=n/2;i++)\n"+
            "	{\n"+
            "		if(n%i!=0)\n"+
            "			continue;\n"+
            "		else\n"+
            "			return 1;\n"+
            "	}\n"+
            "	return 0;\n"+
            "}\n";



    static String program53 ="// 53. Addition of three numbers using function\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "sum(int,int,int);\n"+
            "void main()\n"+
            "{\n"+
            "	int a,b,c,d;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nACCEPT VALUE FOR a,b,c:\\n\");\n"+
            "	scanf(\"%d %d %d\",&a,&b,&c);\n"+
            "	d=sum(a,b,c);\n"+
            "	printf(\"\\nSUM OF %d,%d and %d IS %d\",a,b,c,d);\n"+
            "	getch();\n"+
            "}\n"+
            "sum(int x,int y,int z)\n"+
            "{\n"+
            "	int temp;\n"+
            "	temp=x+y+z;\n"+
            "	return(temp);\n"+
            "}\n"+
            "\n";



    static String program54 ="// 54. To check if a number is Armstrong or not\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int num,num1,digit,arm=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&num);\n"+
            "	num1=num;\n"+
            "	do\n"+
            "        {\n"+
            "		digit=num%10;\n"+
            "		num=num/10;\n"+
            "		arm=arm+(digit*digit*digit);\n"+
            "	}while(num!=0);\n"+
            "	if(arm==num1)\n"+
            "		printf(\"\\n%d IS AN AMSTORNG NUMBER\",num1);\n"+
            "	else\n"+
            "		printf(\"\\n%d IS NOT AN AMSTRONG NUMBER\",num1);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program55 ="// 55. To check a given number is prime or not\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int n,i,c=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	for(i=1;i<=n;i++)\n"+
            "	{\n"+
            "		if(n%i==0)\n"+
            "			c++;\n"+
            "	}\n"+
            "	if(c==2)\n"+
            "		printf(\"\\n%d IS A PRIME NUMBER\",n);\n"+
            "	else\n"+
            "		printf(\"\\n%d IS NOT A PRIME NUMBER\",n);\n"+
            "	getch();\n"+
            "}\n"+
            "\n";



    static String program56 ="// 56. To print the prime numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "main()\n"+
            "{\n"+
            "	int n,i,j,c;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	printf(\"\\nPRIME NUMBERS WITHIN %d ARE:\\n\",n);\n"+
            "	for(i=1;i<=n;i++)\n"+
            "	{\n"+
            "		c=0;\n"+
            "		for(j=1;j<=i;j++)\n"+
            "		{\n"+
            "			if(i%j==0)\n"+
            "				c++;\n"+
            "		}\n"+
            "		if(c==2)\n"+
            "			printf(\"%d \",i);\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n";



    static String program57 ="// 57. Lowest number from three given numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int a,b,c;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER THREE NUMBERS:\\n\");\n"+
            "	scanf(\"%d %d %d\",&a,&b,&c);\n"+
            "	if(a<b && a<c)\n"+
            "		printf(\"\\nLOWEST NUMBER IS %d\",a);\n"+
            "	if(b<c && b<a)\n"+
            "		printf(\"\\nLOWEST NUMBER IS %d\",b);\n"+
            "	if(c<a && c<b)\n"+
            "		printf(\"\\nLOWEST NUMBER IS %d\",c);\n"+
            "	getch();\n"+
            "}\n";



    static String program58 ="// 58. To add the even numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int i,n;\n"+
            "	unsigned long sum=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	for(i=2;i<=n;i+=2)\n"+
            "	{\n"+
            "		sum=sum+i;\n"+
            "	}\n"+
            "printf(\"\\nSUM OF THE EVEN NUMBERS BETWEEN 1 TO %d IS %lu\",n,sum);\n"+
            "	getch();\n"+
            "}\n";



    static String program59 ="// 59. To add the odd numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int i,n;\n"+
            "	unsigned long sum=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	for(i=1;i<=n;i+=2)\n"+
            "	{\n"+
            "		sum=sum+i;\n"+
            "	}\n"+
            "	printf(\"\\nSUM OF THE ODD NUMBERS BETWEEN 1 TO %d IS %lu\",n,sum);\n"+
            "	getch();\n"+
            "}\n";



    static String program60 ="// 60. To print the even numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int i,n;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	printf(\"\\nEVEN NUMBERS BETWEEN 1 AND %d ARE: \\n\",n);\n"+
            "	for(i=2;i<=n;i+=2)\n"+
            "   {\n"+
            "		printf(\"%d \",i);\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n";



    static String program61 ="// 61. To print the odd numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int i,n;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	printf(\"\\nODD NUMBERS BETWEEN 1 AND %d ARE: \\n\",n);\n"+
            "	for(i=1;i<=n;i+=2)\n"+
            "	{\n"+
            "		printf(\"%d \",i);\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n";



    static String program62 ="// 62. To reverse a given number\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	unsigned long num,rev;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%lu\",&num);\n"+
            "	printf(\"\\nTHE REVERSE OF THE NUMBER %lu IS \",num);\n"+
            "	do\n"+
            "   {\n"+
            "		rev=num%10;\n"+
            "		num=num/10;\n"+
            "		printf(\"%lu\",rev);\n"+
            "	}while(num!=0);\n"+
            "	getch();\n"+
            "}\n";



    static String program63 ="// 63.Find the Sum of digits in C\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int digit;\n"+
            "	unsigned long num,sum=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%lu\",&num);\n"+
            "	do\n"+
            "        {\n"+
            "		digit=num%10;\n"+
            "		num=num/10;\n"+
            "		sum=sum+digit;\n"+
            "	}\n"+
            "	while(num!=0);\n"+
            "	printf(\"\\nSUM OF THE DIGITS IS %lu\",sum);\n"+
            "	getch();\n"+
            "}\n";



    static String program64 ="// 64. To print natural numbers upto a given number in C\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int i=1,n;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	printf(\"\\nNATURAL NUMBERS UPTO %d ARE:\\n\",n);\n"+
            "	while(i<=n)\n"+
            "   {\n"+
            "		printf(\"%d \",i);\n"+
            "		i=i+1;\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n";



    static String program65 ="// 65. To check leap year or not\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int year,n;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A YEAR: \");\n"+
            "	scanf(\"%d\",&year);\n"+
            "	if(year%4==0)\n"+
            "		printf(\"\\n%d IS A LEAP YEAR\",year);\n"+
            "	else\n"+
            "		printf(\"\\n%d IS NOT A LEAP YEAR\",year);\n"+
            "	getch();\n"+
            "}\n";



    static String program66 ="// 66. To check if a number is odd or even\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int a;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A NUMBER: \");\n"+
            "	scanf(\"%d\",&a);\n"+
            "	if(a%2==0)\n"+
            "		printf(\"\\nTHE NUMBER IS AN EVEN NUMBER\");\n"+
            "	else\n"+
            "		printf(\"\\nTHE NUMBER IS AN ODD NUMBER\");\n"+
            "	getch();\n"+
            "}\n";



    static String program67 ="// 67. Reverse the order of each word of the string using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	char *s;\n"+
            "	int len,i,j,sp=0,start,end;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A STRING: \");\n"+
            "	gets(s);\n"+
            "printf(\"\\nTHE STRING AFTER CHANGING THE ORDER OF EACH WORD:\\n\");\n"+
            "	len=strlen(s);\n"+
            "	end=len-1;\n"+
            "	for(i=len-1;i>=0;i- -)\n"+
            "	{\n"+
            "		if(s[i]==32 || i==0)\n"+
            "		{\n"+
            "			if(i==0)\n"+
            "				start=0;\n"+
            "			else\n"+
            "				start=i+1;\n"+
            "			for(j=start;j<=end;j++)\n"+
            "				printf(\"%c\",s[j]);\n"+
            "			end=i-1;\n"+
            "			printf(\" \");\n"+
            "		}\n"+
            "	}\n"+
            "	getch();\n"+
            "}\n";



    static String program68 ="// 68. Reverse a string using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	char *s;\n"+
            "	int len,i;\n"+
            "	clrscr();\n"+
            "	printf(\"\nENTER A STRING: \");\n"+
            "	gets(s);\n"+
            "	len=strlen(s);\n"+
            "	printf(\"\nTHE REVERSE OF THE STRING IS:\");\n"+
            "	for(i=len;i>=0;i- -)\n"+
            "		printf(\"%c\",*(s+i));\n"+
            "	getch();\n"+
            "}\n";



    static String program69 ="// 69. To find the maximum number out of n numbers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int n,*p,i,h=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nHOW MANY NUMBERS: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	p=(int *) malloc(n*2);\n"+
            "	if(p==NULL)\n"+
            "	{\n"+
            "		printf(\"\\nMEMORY ALLOCATION UNSUCCESSFUL\");\n"+
            "		exit();\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "	{\n"+
            "		printf(\"\\nENTER NUMBER %d: \",i+1);\n"+
            "		scanf(\"%d\",(p+i));\n"+
            "	}\n"+
            "	h=*p;\n"+
            "	for(i=1;i<n;i++)\n"+
            "	{\n"+
            "		if(*(p+i)>h)\n"+
            "			h=*(p+i);\n"+
            "	}\n"+
            "	printf(\"\\nTHE HIGHEST NUMBER IS %d\",h);\n"+
            "	getch();\n"+
            "}\n";



    static String program70 ="// 70. To swap the address of two variables using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void swap(int *,int *);\n"+
            "void main()\n"+
            "{\n"+
            "	int a=10,b=20;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nVALUES OF a AND b BEFORE SWAPING ARE %d %d\",a,b);\n"+
            "	swap(&a,&b);\n"+
            "	printf(\"\\nVALUES OF a AND b AFTER SWAPING ARE %d %d\",a,b);\n"+
            "	getch();\n"+
            "}\n"+
            "void swap(x,y)\n"+
            "int *x,*y;\n"+
            "{\n"+
            "	int t;\n"+
            "	t=*x;\n"+
            "	*x=*y;\n"+
            "	*y=t;\n"+
            "}\n";



    static String program71 ="// 71. To sort n given numbers using pointers\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "#include <alloc.h>\n"+
            "void main()\n"+
            "{\n"+
            "	int n,*p,i,j,temp;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nHOW MANY NUMBER: \");\n"+
            "	scanf(\"%d\",&n);\n"+
            "	p=(int *) malloc(n*2);\n"+
            "	if(p==NULL)\n"+
            "	{\n"+
            "		printf(\"\\nMEMORY ALLOCATION UNSUCCESSFUL\");\n"+
            "		exit();\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "	{\n"+
            "		printf(\"\\nENTER NUMBER %d: \",i+1);\n"+
            "		scanf(\"%d\",p+i);\n"+
            "	}\n"+
            "	for(i=0;i<n;i++)\n"+
            "	{\n"+
            "		for(j=0;j<n;j++)\n"+
            "		{\n"+
            "			if(*(p+i)<*(p+j))\n"+
            "			{\n"+
            "				temp=*(p+i);\n"+
            "				*(p+i)=*(p+j);\n"+
            "				*(p+j)=temp;\n"+
            "			}\n"+
            "		}\n"+
            "	}\n"+
            "	printf(\"\\nTHE SORTED NUMBERS ARE:\\n\");\n"+
            "	for(i=0;i<n;i++)\n"+
            "		printf(\"%d \",*(p+i));\n"+
            "	getch();\n"+
            "}\n";



    static String program72 ="// 72. To check given string is palindrome or not\n"+
            "\n"+
            "#include <stdio.h>\n"+
            "#include <conio.h>\n"+
            "void main() {\n"+
            "	char *a;\n"+
            "	int i,len,flag=0;\n"+
            "	clrscr();\n"+
            "	printf(\"\\nENTER A STRING: \");\n"+
            "	gets(a);\n"+
            "	len=strlen(a);\n"+
            "	for (i=0;i<len;i++)\n" +
            "   {\n"+
            "		if(a[i]==a[len-i-1])\n"+
            "		     flag=flag+1;\n"+
            "	}\n"+
            "	if(flag==len)\n"+
            "	        printf(\"\\nTHE STRING IS PALINDROME\"); \n"+
            "	else\n"+
            "	        printf(\"\\nTHE STRING IS NOT PALINDROME\");\n"+
            "	getch();\n"+
            "}\n";





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explist);
    }

    public void pro1(View v)
    {
        navigate(R.id.button1, "c1", program1);
    }
    public void pro2(View v)
    {
        navigate(R.id.button2,"c2",program2);
    }
    public void pro3(View v)
    {
        navigate(R.id.button3,"c3",program3);
    }
    public void pro4(View v)
    {
        navigate(R.id.button4,"c4",program4);
    }
    public void pro5(View v)
    {
        navigate(R.id.button5,"c5",program5);
    }
    public void pro6(View v)
    {
        navigate(R.id.button6,"c6",program6);
    }
    public void pro7(View v)
    {
        navigate(R.id.button7,"c7",program7);
    }
    public void pro8(View v)
    {
        navigate(R.id.button8,"c8",program8);
    }
    public void pro9(View v)
    {
        navigate(R.id.button9,"c9",program9);
    }
    public void pro10(View v)
    {
        navigate(R.id.button10,"c10",program10);
    }
    public void pro11(View v)
    {
        navigate(R.id.button11,"c11",program11);
    }
    public void pro12(View v)
    {
        navigate(R.id.button12,"c12",program12);
    }
    public void pro13(View v)
    {
        navigate(R.id.button13,"c13",program13);
    }
    public void pro14(View v)
    {
        navigate(R.id.button14,"c14",program14);
    }
    public void pro15(View v)
    {
        navigate(R.id.button15,"c15",program15);
    }
    public void pro16(View v)
    {
        navigate(R.id.button16,"c16",program16);
    }
    public void pro17(View v)
    {
        navigate(R.id.button17,"c17",program17);
    }
    public void pro18(View v)
    {
        navigate(R.id.button18,"c18",program18);
    }
    public void pro19(View v)
    {
        navigate(R.id.button19,"c19",program19);
    }
    public void pro20(View v)
    {
        navigate(R.id.button20,"c20",program20);
    }
    public void pro21(View v)
    {
        navigate(R.id.button21,"c21",program21);
    }
    public void pro22(View v)
    {
        navigate(R.id.button22,"c22",program22);
    }
    public void pro23(View v)
    {
        navigate(R.id.button23,"c23",program23);
    }
    public void pro24(View v)
    {
        navigate(R.id.button24,"c24",program24);
    }
    public void pro25(View v)
    {
        navigate(R.id.button25,"c25",program25);
    }
    public void pro26(View v)
    {
        navigate(R.id.button26,"c26",program26);
    }
    public void pro27(View v)
    {
        navigate(R.id.button27,"c27",program27);
    }
    public void pro28(View v)
    {
        navigate(R.id.button28,"c28",program28);
    }
    public void pro29(View v)
    {
        navigate(R.id.button29,"c29",program29);
    }
    public void pro30(View v)
    {
        navigate(R.id.button30,"c30",program30);
    }
    public void pro31(View v)
    {
        navigate(R.id.button31,"c31",program31);
    }
    public void pro32(View v)
    {
        navigate(R.id.button32,"c32",program32);
    }
    public void pro33(View v)
    {
        navigate(R.id.button33,"c33",program33);
    }
    public void pro34(View v)
    {
        navigate(R.id.button34,"c34",program34);
    }
    public void pro35(View v)
    {
        navigate(R.id.button35,"c35",program35);
    }
    public void pro36(View v)
    {
        navigate(R.id.button36,"c36",program36);
    }
    public void pro37(View v)
    {
        navigate(R.id.button37,"c37",program37);
    }
    public void pro38(View v)
    {
        navigate(R.id.button38,"c38",program38);
    }
    public void pro39(View v)
    {
        navigate(R.id.button39,"c39",program39);
    }
    public void pro40(View v)
    {
        navigate(R.id.button40,"c40",program40);
    }
    public void pro41(View v)
    {
        navigate(R.id.button41,"c41",program41);
    }
    public void pro42(View v)
    {
        navigate(R.id.button42,"c42",program42);
    }
    public void pro43(View v)
    {
        navigate(R.id.button43,"c43",program43);
    }
    public void pro44(View v)
    {
        navigate(R.id.button44,"c44",program44);
    }
    public void pro45(View v)
    {
        navigate(R.id.button45,"c45",program45);
    }
    public void pro46(View v)
    {
        navigate(R.id.button46,"c46",program46);
    }
    public void pro47(View v)
    {
        navigate(R.id.button47,"c47",program47);
    }
    public void pro48(View v)
    {
        navigate(R.id.button48,"c48",program48);
    }
    public void pro49(View v)
    {
        navigate(R.id.button49,"c49",program49);
    }
    public void pro50(View v)
    {
        navigate(R.id.button50,"c50",program50);
    }
    public void pro51(View v)
    {
        navigate(R.id.button51,"c51",program51);
    }
    public void pro52(View v)
    {
        navigate(R.id.button52,"c52",program52);
    }
    public void pro53(View v)
    {
        navigate(R.id.button53,"c53",program53);
    }
    public void pro54(View v)
    {
        navigate(R.id.button54,"c54",program54);
    }
    public void pro55(View v)
    {
        navigate(R.id.button55,"c55",program55);
    }
    public void pro56(View v)
    {
        navigate(R.id.button56,"c56",program56);
    }
    public void pro57(View v)
    {
        navigate(R.id.button57,"c57",program57);
    }
    public void pro58(View v)
    {
        navigate(R.id.button58,"c58",program58);
    }
    public void pro59(View v)
    {
        navigate(R.id.button59,"c59",program59);
    }
    public void pro60(View v)
    {
        navigate(R.id.button60,"c60",program60);
    }
    public void pro61(View v)
    {
        navigate(R.id.button61,"c61",program61);
    }
    public void pro62(View v)
    {
        navigate(R.id.button62,"c62",program62);
    }
    public void pro63(View v)
    {
        navigate(R.id.button63,"c63",program63);
    }
    public void pro64(View v)
    {
        navigate(R.id.button64,"c64",program64);
    }
    public void pro65(View v)
    {
        navigate(R.id.button65,"c65",program65);
    }
    public void pro66(View v)
    {
        navigate(R.id.button66,"c66",program66);
    }
    public void pro67(View v)
    {
        navigate(R.id.button67,"c67",program67);
    }
    public void pro68(View v)
    {
        navigate(R.id.button68,"c68",program68);
    }
    public void pro69(View v)
    {
        navigate(R.id.button69,"c69",program69);
    }
    public void pro70(View v)
    {
        navigate(R.id.button70,"c70",program70);
    }
    public void pro71(View v)
    {
        navigate(R.id.button71,"c71",program71);
    }
    public void pro72(View v)
    {
        navigate(R.id.button72,"c72",program72);
    }

    public void navigate(int id,String code,String program)
    {
        b1 = (Button)findViewById(id);
        Intent i = new Intent(explist.this,MainActivity.class);
        i.putExtra(code,program);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed()
    {
        // TODO Auto-generated method stub
        super.onBackPressed();
        //AdBuddiz.showAd(this);
        Intent i = new Intent(explist.this,home.class);
        startActivity(i);
        finish();
    }


}
