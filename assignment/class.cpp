#include <iostream>
#include <iomanip>
using namespace std;

class Student
{
public:
    int serialNumber;
    string firstName;
    string courseStudy;
    char gradeMath;
    char gradeEnglish;
    char gradePhysics;
    char gradeCS;

    // function to read details
    void readDetails()
    {
        cout << "Enter the serial number of the student: ";
        cin >> serialNumber;
        cout << "Enter the first name of the student: ";
        cin >> firstName;
        cout << "Enter the course of study of the student: ";
        cin >> courseStudy;
        cout << "Enter the grade of math of the student: ";
        cin >> gradeMath;
        cout << "Enter the grade of english of the student: ";
        cin >> gradeEnglish;
        cout << "Enter the grade of physics of the student: ";
        cin >> gradePhysics;
        cout << "Enter the grade of CS of the student: ";
        cin >> gradeCS;
    }
    // function to display details
    void displayDetails()
    {
        cout << left << setw(16) << serialNumber
             << left << setw(20) << firstName
             << left << setw(15) << courseStudy
             << left << setw(11) << gradeMath
             << left << setw(15) << gradeEnglish
             << left << setw(15) << gradePhysics
             << left << setw(18) << gradeCS
             << endl;
    }

};
int main(){
    int i,c;
    i=0;
    cout<<"Enter the number of students: ";
    cin>>c;
    Student students[c];
    for(i=0;i<c;i++){
        students[i].readDetails();
    }
    cout << left << setw(15) << "Serial_Number" << left << setw(15) << "First_Name" << left
             << setw(15) << "Course_Study" << left << setw(15) << "Grade_Math" << left << setw(15) << "Grade_English" << left << setw(15) << "Grade_Physics" << left << setw(15) << "Grade_Computer_Science" << endl;
   for ( i = 0; i < c; i++)
   {
        students[i].displayDetails();
   }


}
