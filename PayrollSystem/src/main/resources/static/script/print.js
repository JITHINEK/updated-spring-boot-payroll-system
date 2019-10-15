function PrintElem(elem)
       {
           Popup($(elem).html());
       }

       function Popup(data)
       {
           var mywindow = window.open('', 'payroll', 'height=600,width=800');
           mywindow.document.write('<html><head><title>Payroll Details</title>');
           mywindow.document.write('');
           mywindow.document.write('');
           mywindow.document.write('</head><body >');
           mywindow.document.write(data);
           mywindow.document.write('</body></html>');

           mywindow.print();
           mywindow.close();

           return true;
       }

      