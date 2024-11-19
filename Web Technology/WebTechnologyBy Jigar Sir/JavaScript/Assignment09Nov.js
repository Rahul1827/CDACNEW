'use strict';

document.getElementById('btn').onclick = function() {
    var data1 = document.getElementById('x1').value;
    var data2 = document.getElementById('x2').value;
    var data3 = document.getElementById('x3').value;
    var msg = "";

    if (data1 === "" || data2 === "" || data3 === "") {
        msg = "Please enter data in all the fields.";
    } else if (isNaN(data1) || isNaN(data2) || isNaN(data3)) {
        msg = "All fields should contain numeric values.";
    } else if (data1 < 0 || data2 < 0 || data3 < 0) {
        msg = "All fields should contain positive values.";
    } else {
        var p = Number(data1);
        var r = parseFloat(data2) / 12 / 100;
        var n = parseInt(data3) * 12;

        var emi = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
        var si = (p * r * n);
        var totalPaid = p + si;

        emi = Math.round(emi);
        si = Math.round(si);
        totalPaid = Math.round(totalPaid);

        document.getElementById("y1").innerHTML = p;
        document.getElementById("y2").innerHTML = totalPaid;
        document.getElementById("y3").innerHTML = si;
        document.getElementById("y4").innerHTML = emi;

        Highcharts.chart('container', {
            chart: {
                type: 'pie'
            },
            title: {
                text: 'Loan Breakdown'
            },
            tooltip: {
                valueSuffix: '₹'
            },
            plotOptions: {
                series: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: [{
                        enabled: true,
                        distance: 20
                    }, {
                        enabled: true,
                        distance: -40,
                        format: '{point.percentage:.1f}%',
                        style: {
                            fontSize: '1.2em',
                            textOutline: 'none',
                            opacity: 0.7
                        },
                        filter: {
                            operator: '>',
                            property: 'percentage',
                            value: 10
                        }
                    }]
                }
            },
            series: [{
                name: 'Amount',
                colorByPoint: true,
                data: [{
                    name: 'Interest',
                    y: si
                }, {
                    name: 'Loan Amount',
                    sliced: true,
                    selected: true,
                    y: p
                }]
            }]
        });
    }

    document.getElementById("result").innerHTML = msg;
};
