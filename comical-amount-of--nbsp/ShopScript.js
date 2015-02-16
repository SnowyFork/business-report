var customercount = 0;
var total1 = 0;
var total2, custcount;
var soccer = new Array();
var baseball = new Array();
var football = new Array();
var basketball = new Array();
var bballnet = new Array();
var cost = new Array();
var tax = new Array();
var soccount = new Array();
var basecount = new Array();
var footcount = new Array();
var baskcount = new Array();
var netcount = new Array();

var i = 0;

function shops()
{
    var x1, x2, x3, x4, x5;

    soccer[i] = 0;
    baseball[i] = 0;
    football[i] = 0;
    basketball[i] = 0;
    bballnet[i] = 0;

       
    if (document.formsports.soccheck.checked) {
        soccer[i] = 9.00;
    }

    if (document.formsports.basecheck.checked) {
        baseball[i] = 5.00;
    }

    if (document.formsports.footcheck.checked) {
        football[i] = 20.00;
    }

    if (document.formsports.baskcheck.checked) {
        basketball[i] = 8.00;
    }

    if (document.formsports.netcheck.checked) {
        bballnet[i] = 140.00;
    }

    //here starts the radios

    if (document.formsports.taxradio[0].checked) 
    {
        tax[i] = 1.07;
    }
    if (document.formsports.taxradio[1].checked) {
        tax[i] = 1.05;
    }
    if (document.formsports.taxradio [2].checked) {
        tax[i] = 1.06;
    }
    
    //here's the combo boxes

    x1 = eval(document.formsports.soccombo.selectedIndex);
    soccount[i] = eval(document.formsports.soccombo.options[x1].value);

    x2 = eval(document.formsports.basecombo.selectedIndex);
    basecount[i] = eval(document.formsports.basecombo.options[x2].value);

    x3 = eval(document.formsports.footcombo.selectedIndex);
    footcount[i] = eval(document.formsports.footcombo.options[x3].value);

    x4 = eval(document.formsports.baskcombo.selectedIndex);
    baskcount[i] = eval(document.formsports.baskcombo.options[x4].value);

    x5 = eval(document.formsports.netcombo.selectedIndex);
    netcount[i] = eval(document.formsports.netcombo.options[x5].value);

    //everything else

    cost[i] = ((soccer[i] * soccount[i]) + (baseball[i] * basecount[i]) + (football[i] * footcount[i]) + (basketball[i] * baskcount[i]) + (bballnet[i] * netcount[i])) * tax[i];

    document.formsports.resultstxt.value = cost[i];

    total2 = document.formsports.totalcost.value;
    total1 = parseFloat(total2);

    total1 += cost[i];
    document.formsports.totalcost.value = total1;

    custcount = document.formsports.customers.value;
    customercount = parseInt(custcount);

    customercount++;
    document.formsports.customers.value = customercount;

    i++;
}

function print()
{
    var printcustomer1, total4;
    var printcustomer2, count3 = 1, total3;

    printcustomer1 = document.formsports.customers.value;
    printcustomer2 = parseInt(printcustomer1);

    total4 = document.formsports.totalcost.value;
    total3 = parseFloat(total4);

    document.formsports.compilation.value += "Customers"+"\t"+"Soccer Balls" + "\t" + "Baseballs" + "\t" + "Football Helmets" + "\t" + "Basketballs" + "\t" + "Basketball Nets" + "\t" + "\n";
    document.formsports.compilation.value += "\n";

    for (var i = 0; i < printcustomer2; i++) 
    {
        document.formsports.compilation.value += count3 + "\t" + "\t" + (soccer[i] * soccount[i]) + "\t" + "\t" + (baseball[i] * basecount[i]) + "\t" + "\t" + (football[i] * footcount[i]) + "\t" + "\t" + "\t" + (basketball[i] * baskcount[i]) + "\t" + "\t" + "\t" + (bballnet[i] * bballnet[i]);
        document.formsports.compilation.value += "\n";
        count3++;
    }

    document.formsports.compilation.value += "\n";
    document.formsports.compilation.value += "\n";
    document.formsports.compilation.value += "Total cost so far " + "\t" + total4;
}
