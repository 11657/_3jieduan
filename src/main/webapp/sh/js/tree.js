var isHidden=false;
function setSorL()
{
	if(isHidden==false)
		{
			main_left.style.display="none";
			main_mid.style.left="0px";
			main_right.style.left="12px";
			main_right.style.width="";
			LR.src="images/img/jiao-4.gif";
			isHidden=true;
		}
	else
		{
			main_left.style.display="block";
			main_mid.style.left="192px";
			main_right.style.left="192px";
			LR.src="images/img/jiao-3.gif";
			isHidden=false;
		}
}


var today=new Date();
year=today.getYear();
month=today.getMonth()+1;
day=today.getDate();
week=new Array(7);
week[0]="��";
week[1]="һ";
week[2]="��";
week[3]="��";
week[4]="��";
week[5]="��";
week[6]="��";