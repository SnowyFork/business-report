//By Chauke A.

#ifndef HOSPITAL_H
#define HOSPITAL_H

#include <string>

using namespace std;

class Hospital
{
	public:
		Hospital(string, string, double);

		void printdata();
		static int getcount();
		void compute();
		
	private:
		string ID, name;
		static int count;
		double days, amountdue;
		static double rent;
};
#endif
