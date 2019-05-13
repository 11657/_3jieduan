<!-- Begin  //place these scripts within BODY tag if you are using IE 4.0 or below.
//****************************************************************************
// PopCalendar 3.20, Emailware(please mail&commend me if u like it)
// Originally coded by Liming(Victor) Weng, email: victorwon@sina.com
// Release date: 2000.2.29
// Anyone may modify it to satify his needs, but please leave this comment ahead.
//****************************************************************************

var gdCtrl = new Object();
var goSelectTag = new Array();
var gcGray = "#808080";
var gcToggle = "#ffff00";
var gcBG = "#EAEAEA";

var gdCurDate = new Date();
var giYear = gdCurDate.getFullYear();
var giMonth = gdCurDate.getMonth()+1;
var giDay = gdCurDate.getDate();

var g_nStartYear = 1990;
var g_nEndYear = 2020;

var g_sFunc = "";

var gShortMonths = new Array("一月","一月","一月","一月","一月","一月","一月","一月","一月","一月","一月","一月");
var gMonths = new Array("一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月");
var gMonthDays = new Array('31', '28', '31', '30', '31', '30', '31', '31', '30', '31', '30', '31');

function fIsLeapYear (Year)
{
	if (((Year % 4)==0) && ((Year % 100)!=0) || ((Year % 400)==0)) {
		return true;
	} 
	else {
		return false;
	}
}

function fGetWeekNum(iYear, iMonth, iDay)
{
	if (iYear==giYear)
	{
		var dtCurr = new Date(iYear, iMonth-1, iDay);
		var i, aDateStart, aDateEnd, dtStart, dtEnd;
		for (i = 0; i < g_aTermStart.length; i++)
		{
			aDateStart = g_aTermStart[i].split("-");
			aDateEnd = g_aTermEnd[i].split("-");
			dtStart = new Date(aDateStart[0], aDateStart[1]-1, aDateStart[2]);
			dtEnd = new Date(aDateEnd[0], aDateEnd[1]-1, aDateEnd[2]);
			if (dtCurr >= dtStart && dtCurr <= dtEnd)
			{
				break;
			}
		}

		if (i < g_aTermStart.length)
		{
			return (Math.floor((dtCurr - dtStart)/(60*60*1000*24*7))+1);
		}
	}

	return "";
}

function fSetDate(iYear, iMonth, iDay){
  VicPopCal.style.visibility = "hidden";
  gdCtrl.value = fMakeDate(iYear, iMonth, iDay);
  for (i in goSelectTag)
  	goSelectTag[i].style.visibility = "visible";
  goSelectTag.length = 0;

	if (g_sFunc != "")
	{
		eval(g_sFunc);
		g_sFunc = "";
	}
}

function fGetMonth(sName, bShort)
{
	sName = sName.toUpperCase();

	for (var i=0; i<12; i++)
	{
		if (bShort)
		{
			if (gShortMonths[i].toUpperCase()==sName)
			{
				return (i+1);
			}
		}
		else
		{
			if (gMonths[i].toUpperCase()==sName)
			{
				return (i+1);
			}
		}
	}

	return 0;
}

function fIsValidDate(dateStr, aDate) {
	if (dateStr != "")
	{
		var matchArray;

		var re = /, /g;
		dateStr = dateStr.replace(re, "/");
		re = / /g;
		dateStr = dateStr.replace(re, "/");
		re = /-/g;
		dateStr = dateStr.replace(re, "/");
		matchArray = dateStr.split("/");

		if (matchArray == null || matchArray.length != 3) {
			alert("Please input a valid date format: " + g_sDateFormat);
			return false;
		}

		var month, day, year;

		if (g_sDateFormat == "mm/dd/yyyy")
		{
			year = matchArray[2];
			month = matchArray[0];
			day = matchArray[1];
		}
		else if (g_sDateFormat == "dd/mm/yyyy")
		{
			year = matchArray[2];
			month = matchArray[1];
			day = matchArray[0];
		}
		else if (g_sDateFormat == "yyyy-mm-dd")
		{
			year = matchArray[0];
			month = matchArray[1];
			day = matchArray[2];
		}
		else if (g_sDateFormat=="dd mmm, yyyy")
		{
			year = matchArray[2];
			month = fGetMonth(matchArray[1], true);
			day = matchArray[0];
		}
		else if (g_sDateFormat=="mmm dd, yyyy")
		{
			year = matchArray[2];
			month = fGetMonth(matchArray[0], true);
			day = matchArray[1];
		}
		else if (g_sDateFormat=="dd mmmm, yyyy")
		{
			year = matchArray[2];
			month = fGetMonth(matchArray[1], false);
			day = matchArray[0];
		}
		else if (g_sDateFormat=="mmmm ddd, yyyy")
		{
			year = matchArray[2];
			month = fGetMonth(matchArray[0], false);
			day = matchArray[1];
		}

		if (month < 1 || month > 12) { // check month range
			alert("Month must be between 1 and 12.");
			return false;
		}
		if (day < 1 || day > 31) {
			alert("Day must be between 1 and 31.");
			return false;
		}
		if ((month==4 || month==6 || month==9 || month==11) && day==31) {
			alert("Month "+month+" doesn't have 31 days!")
			return false;
		}
		if (month == 2) { // check for february 29th
			var isleap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
			if (day>29 || (day==29 && !isleap)) {
				alert("February " + year + " doesn't have " + day + " days!");
				return false;
		   }
		}

		aDate[0] = year;
		aDate[1] = month;
		aDate[2] = day;

		return true;
	}

	return false;  // date is valid
}


function fFormatDate(dtDate)
{
	return fMakeDate(dtDate.getFullYear(), dtDate.getMonth()+1, dtDate.getDate());
}

function fMakeDate(iYear, iMonth, iDay)
{
	if (g_sDateFormat=="dd/mm/yyyy")
		return iDay+"/"+iMonth+"/"+iYear;
	else if (g_sDateFormat=="mm/dd/yyyy")
		return iMonth+"/"+iDay+"/"+iYear;
	else if (g_sDateFormat=="dd mmm, yyyy")
		return iDay+" "+gShortMonths[iMonth-1]+", "+iYear;
	else if (g_sDateFormat=="mmm dd, yyyy")
		return gShortMonths[iMonth-1]+" "+iDay+", "+iYear;
	else if (g_sDateFormat=="dd mmmm, yyyy")
		return iDay+" "+gMonths[iMonth-1]+", "+iYear;
	else if (g_sDateFormat=="mmmm ddd, yyyy")
		return gMonths[iMonth-1]+" "+iDay+", "+iYear;
	else
		return iYear+"-"+iMonth+"-"+iDay;
}

function fSetSelected(aCell){
  var iOffset = 0;
  var iYear = parseInt(tbSelYear.value);
  var iMonth = parseInt(tbSelMonth.value);

  self.event.cancelBubble = true;
  aCell.bgColor = gcBG;
  with (aCell.children["cellText"]){
  	var iDay = parseInt(innerText);
  	if (color==gcGray)
		iOffset = (Victor<10)?-1:1;
	iMonth += iOffset;
	if (iMonth<1) {
		iYear--;
		iMonth = 12;
	}else if (iMonth>12){
		iYear++;
		iMonth = 1;
	}
  }
  fSetDate(iYear, iMonth, iDay);
}

function Point(iX, iY){
	this.x = iX;
	this.y = iY;
}

function fBuildCal(iYear, iMonth) {
  var aMonth=new Array();
  for(i=1;i<7;i++)
  	aMonth[i]=new Array(i);

  var dCalDate=new Date(iYear, iMonth-1, 1);
  var iDayOfFirst=dCalDate.getDay();
  var iDaysInMonth=new Date(iYear, iMonth, 0).getDate();
  var iOffsetLast=new Date(iYear, iMonth-1, 0).getDate()-iDayOfFirst+1;
  var iDate = 1;
  var iNext = 1;

  for (d = 0; d < 7; d++)
	aMonth[1][d] = (d<iDayOfFirst)?-(iOffsetLast+d):iDate++;
  for (w = 2; w < 7; w++)
  	for (d = 0; d < 7; d++)
		aMonth[w][d] = (iDate<=iDaysInMonth)?iDate++:-(iNext++);
  return aMonth;
}

function fDrawCal(iYear, iMonth, iCellHeight, sDateTextSize) {
  var WeekDay = new Array("Sun","Mon","Tue","Wed","Thu","Fri","Sat");
  var styleTD = " bgcolor='"+gcBG+"' bordercolor='"+gcBG+"' valign='middle' align='center' height='"+iCellHeight+"' style='font:Arial Narrow "+sDateTextSize+";";            //Coded by Liming Weng(Victor Won) email:victorwon@sina.com

  with (document) {
	write("<tr>");

	if (g_bShowWeek)
		write("<td "+styleTD+"color:#990099'>WK</td>");

	for(i=0; i<7; i++)
		write("<td "+styleTD+"color:#000099'>" + WeekDay[i] + "</td>");
	write("</tr>");

  	for (w = 1; w < 7; w++) {
		write("<tr>");

		if (g_bShowWeek)
			write("<td "+styleTD+"color:#990099'><font id=wkText> </font></td>");

		for (d = 0; d < 7; d++) {
			write("<td id=calCell "+styleTD+"cursor:hand;' onMouseOver='this.bgColor=gcToggle' onMouseOut='this.bgColor=gcBG' onclick='fSetSelected(this)'>");
			write("<font id=cellText Victor='Liming Weng'> </font>");
			write("</td>")
		}
		write("</tr>");
	}
  }
}

function fUpdateCal(iYear, iMonth, iDay) {
	myMonth = fBuildCal(iYear, iMonth);
	var i = 0;
	for (w = 0; w < 6; w++)
	{
		if (g_bShowWeek)
		{
			with (wkText[w])
			{
				var y = iYear;
				var m = iMonth
				var d = myMonth[w+1][1];

				if (w==0)
				{
					d = myMonth[w+1][6];
					if (d<0)
					{
						if (m==1)
						{
							y--;
							m = 12;
							d = -d;
						}
						else
						{
							m--;
							d = -d;
						}
					}
				}
				else if (w==5)
				{
					if (d<0)
					{
						if (m==12)
						{
							y++;
							m = 1;
							d = -d;
						}
						else
						{
							m++;
							d = -d;
						}
					}
				}
				
				innerText = fGetWeekNum(y, m, d);
			}
		}

		for (d = 0; d < 7; d++)
		{
			with (cellText[(7*w)+d])
			{
				Victor = i++;
				if (myMonth[w+1][d]<0)
				{
					color = gcGray;
					innerText = -myMonth[w+1][d];
				}else
				{
					color = ((d==0)||(d==6))?"red":"black";
					innerText = myMonth[w+1][d];

					if (myMonth[w+1][d]==iDay)
						color = "blue";
				}
			}
		}
	}
}

function fSetYearMon(iYear, iMon, iDay){
  tbSelMonth.options[iMon-1].selected = true;
  for (i = 0; i < tbSelYear.length; i++)
	if (tbSelYear.options[i].value == iYear)
		tbSelYear.options[i].selected = true;
  fUpdateCal(iYear, iMon, iDay);
}

function fPrevYear(){
  var iMon = tbSelMonth.value;
  var iYear = tbSelYear.value;

  if (iYear>g_nStartYear) {
	  iYear--;
  }

  fSetYearMon(iYear, iMon);
}

function fNextYear(){
  var iMon = tbSelMonth.value;
  var iYear = tbSelYear.value;

  if (iYear<g_nEndYear) {
	  iYear++;
  }

  fSetYearMon(iYear, iMon);
}

function fPrevMonth(){
  var iMon = tbSelMonth.value;
  var iYear = tbSelYear.value;

  if (--iMon<1) {
	  iMon = 12;
	  iYear--;
  }

  fSetYearMon(iYear, iMon);
}

function fNextMonth(){
  var iMon = tbSelMonth.value;
  var iYear = tbSelYear.value;

  if (++iMon>12) {
	  iMon = 1;
	  iYear++;
  }

  fSetYearMon(iYear, iMon);
}

function fToggleTags(){
  with (document.all.tags("SELECT")){
 	for (i=0; i<length; i++)
 		if ((item(i).Victor!="Won")&&fTagInBound(item(i))){
 			item(i).style.visibility = "hidden";
 			goSelectTag[goSelectTag.length] = item(i);
 		}
  }
}

function fTagInBound(aTag){
  with (VicPopCal.style){
  	var l = parseInt(left);
  	var t = parseInt(top);
  	var r = l+parseInt(width);
  	var b = t+parseInt(height);
	var ptLT = fGetXY(aTag);
	return !((ptLT.x>r)||(ptLT.x+aTag.offsetWidth<l)||(ptLT.y>b)||(ptLT.y+aTag.offsetHeight<t));
  }
}

function fGetXY(aTag){
  var oTmp = aTag;
  var pt = new Point(0,0);
  do {
  	pt.x += oTmp.offsetLeft;
  	pt.y += oTmp.offsetTop;
  	oTmp = oTmp.offsetParent;
  } while(oTmp.tagName!="BODY");
  return pt;
}

// Main: popCtrl is the widget beyond which you want this calendar to appear;
//       dateCtrl is the widget into which you want to put the selected date.
// i.e.: <input type="text" name="dc" style="text-align:center" readonly><INPUT type="button" value="V" onclick="fPopCalendar(dc,dc);return false">
function fPopCalendar(popCtrl, dateCtrl, nStartYear, nEndYear, sFunc){
  var nEndYear = 2010;	
  if (nStartYear > 0)
	g_nStartYear = nStartYear;
  if (nEndYear > 0)
	g_nEndYear = nEndYear;

  g_sFunc = sFunc;

  tbSelYear.options.length = g_nEndYear-g_nStartYear+1;
  for (var i=g_nStartYear; i<=g_nEndYear; i++)
  {
	tbSelYear.options[i-g_nStartYear].value=i;
	tbSelYear.options[i-g_nStartYear].text=i;
  }

  gdCtrl = dateCtrl;
  var aDate = new Array(3);
  var iYear, iMonth, iDay;
  if (fIsValidDate(gdCtrl.value, aDate))
  {
	iYear=aDate[0];
	iMonth=aDate[1];
	iDay=aDate[2];
  }
  else
  {
	iYear=giYear;
	iMonth=giMonth;
	iDay=giDay;
  }

  fSetYearMon(iYear, iMonth, iDay);
  var point = fGetXY(popCtrl);
  with (VicPopCal.style) {
  	left = point.x;
	top  = point.y+popCtrl.offsetHeight+1;
	width = VicPopCal.offsetWidth;
	height = VicPopCal.offsetHeight;
	fToggleTags();
	visibility = 'visible';
  }
  VicPopCal.focus();
}

function fHideCal(){
  var oE = window.event;
  if ((oE.clientX>0)&&(oE.clientY>0)&&(oE.clientX<document.body.clientWidth)&&(oE.clientY<document.body.clientHeight)) {
	var oTmp = document.elementFromPoint(oE.clientX,oE.clientY);
	while ((oTmp.tagName!="BODY") && (oTmp.id!="VicPopCal"))
		oTmp = oTmp.offsetParent;
	if (oTmp.id=="VicPopCal")
		return;
  }
  VicPopCal.style.visibility = 'hidden';
  for (i in goSelectTag)
	goSelectTag[i].style.visibility = "visible";
  goSelectTag.length = 0;
}

with (document) {
write("<Div id='VicPopCal' onblur='fHideCal()' onclick='focus()' style='POSITION:absolute;visibility:hidden;border:1px ridge;z-index:100;'>");
write("<table border='0' bgcolor='silver' width='258'>");
write("<TR>");
write("<td valign='middle' align='center'><input type='button' name='PrevYear' value='<<' style='height:20;width:22;FONT:bold' onClick='fPrevYear()' onblur='fHideCal()' TITLE='Prev Year'> <input type='button' name='PrevMonth' value='<' style='height:20;width:19;FONT:bold' onClick='fPrevMonth()' onblur='fHideCal()' TITLE='Prev Month'>");
write("&nbsp;<select name='tbSelMonth' onChange='fUpdateCal(tbSelYear.value, tbSelMonth.value)' Victor='Won' onclick='self.event.cancelBubble=true' onblur='fHideCal()'>");
for (i=0; i<12; i++)
	write("<option value='"+(i+1)+"'>"+gMonths[i]+"</option>");
write("</SELECT>");
write("&nbsp;<SELECT name='tbSelYear' onChange='fUpdateCal(tbSelYear.value, tbSelMonth.value)' Victor='Won' onclick='self.event.cancelBubble=true' onblur='fHideCal()'>");
for(i=g_nStartYear;i<=g_nEndYear;i++)
	write("<OPTION value='"+i+"'>"+i+"</OPTION>");
write("</SELECT>");
write("&nbsp;<input type='button' name='NextMonth' value='>' style='height:20;width:19;FONT:bold' onclick='fNextMonth()' onblur='fHideCal()' TITLE='Next Month'> <input type='button' name='NextYear' value='>>' style='height:20;width:22;FONT:bold' onclick='fNextYear()' onblur='fHideCal()' TITLE='Next Year'>");
write("</td>");
write("</TR><TR>");
write("<td align='center'>");
write("<DIV style='background-color:teal'><table width='100%' border='0' cellpadding='1' cellspacing='1'>");
fDrawCal(giYear, giMonth, 20, '12');
write("</table></DIV>");
write("</td>");
write("</TR><TR><TD align='center'>");
write("<B style='cursor:hand' onclick='fSetDate(giYear,giMonth,giDay); self.event.cancelBubble=true' onMouseOver='this.style.color=gcToggle' onMouseOut='this.style.color=0'>Today:  "+gMonths[giMonth-1]+" "+giDay+", "+giYear+"</B>");
write("</TD></TR>");write("</TD></TR>");
write("</TABLE></Div>");
}
// End -- Coded by Liming Weng, email: victrowon@sina.com -->
