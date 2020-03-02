using System;
using System.Collections.Generic;
using System.Text;

namespace InheritanceExamp
{
    class Student : Person
    {
        public string Program;
        public int Year;
        public double Fee;
       
        public Student(string program, int year, double fee,string Name,string Address) : base( Name, Address)
        {
            this.Program =program;
            this.Year = year;
            this.Fee = fee;
       }
        
       public override void GetDetails() 
        {
            Console.WriteLine($"Person name :{Name} Address:{Address} Program:{Program} Year:{Year} Fee :{Fee}");
        }

    }
}
