
#include <iostream>
#include<stdio.h>
#include <iomanip>

using namespace std;

struct student{
    int serialNumber;
    string firstName;
    string courseStudy;
    char gradeMath;
    char gradeEnglish;
    char gradePhysics;
    char gradeCS;

};

int main(){

    // serialNumber(int) firstName(string),courseStudy(string),GradeMath(char),gradeEnglish(char),
    // gardePhysics(char),gradeCS(char).
    int c =1;
    student students[c];

   for(int i =0;i <c;i++){
    cout<<"Enter the serial number of the student: ";
    cin>>students[i].serialNumber;
    cout<<"Enter the first name of the student: ";
    cin>>students[i].firstName;
    cout<<"Enter the course of study of the student: ";
    cin>>students[i].courseStudy;
    cout<<"Enter the grade of math of the student: ";
    cin>>students[i].gradeMath;
    cout<<"Enter the grade of english of the student: ";
    cin>>students[i].gradeEnglish;
    cout<<"Enter the grade of physics of the student: ";
    cin>>students[i].gradePhysics;
    cout<<"Enter the grade of CS of the student: ";
    cin>>students[i].gradeCS;
   }

    cout << left << setw(15) << "Serial Number" << left << setw(15) << "First Name" << left
         << setw(15) << "Course Study" << left << setw(15) << "Grade Math" << left << setw(15) << "Grade English" << left << setw(15) << "Grade Physics" << left << setw(15) << "Grade Computer Science" << endl;

    for (int i = 0; i < c; i++)
    {
        cout << left << setw(16) << students[i].serialNumber
             << left << setw(20) << students[i].firstName
             << left << setw(15) << students[i].courseStudy
             << left << setw(11) << students[i].gradeMath
             << left << setw(15) << students[i].gradeEnglish
             << left << setw(15) << students[i].gradePhysics
             << left << setw(18) << students[i].gradeCS
             << endl;
    }

    return 0;
}
