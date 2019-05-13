function overbutton(){
	if(src=event.srcElement)
		if(src.className=="normal"){
			src.className='hover';
		}
}
function outbutton(){
	if(src=event.srcElement)
		if(src.className=="hover"){
			src.className='normal';
		}
}

function clickbutton(){

	if(src=event.srcElement){

		if(src.className=="hover"){
			for (i=0; i < document.all.button.rows.length; i++) {
				for (j=0; j < document.all.button.rows(i).cells.length; j++) {
					if (document.all.button.rows(i).cells(j).className != "")
						document.all.button.rows(i).cells(j).className = "normal";					
				}
			}
			src.className='click';

		}

	}

}

document.onmouseover=overbutton
document.onmouseout=outbutton
document.onclick=clickbutton




function win(){
	window.open("Fmcf0319.html","","width=500,height=600,scrollbars=no,menubar=no,statusbar=no,top=200,left=200");
}
function wins(){
	window.open("Fmcf0307.html","","width=500,height=600,scrollbars=no,menubar=no,statusbar=no,top=200,left=200");
}
function winm(){
	window.open("Fmcf0316.html","","width=500,height=600,scrollbars=no,menubar=no,statusbar=no,top=200,left=200");
}

function windoww(){
	window.open("dingdan.html","","width=500,height=600,scrollbars=no,menubar=no,statusbar=no,top=200,left=200");
}

function peisong(){
	window.open("peisong.html","","width=500,height=600,scrollbars=no,menubar=no,statusbar=no,top=200,left=200");
}


function del(){
	document.all.tables.deleteRow(2);
}

function decision(){
	window.open("new.html","","width=430,height=600,scrollbars=no,menubar=no,statusbar=no,top=200,left=200");
}

function insrow(){
	var x=document.getElementById("tables").insertRow(2);
	var y=x.insertCell(0);
	var a=x.insertCell(1);
	var b=x.insertCell(2);
	var c=x.insertCell(3);
	
	
	y.innerHTML="&nbsp;"
	z.innerHTML="&nbsp;"
	a.innerHTML="&nbsp;"
	b.innerHTML="&nbsp;"
	c.innerHTML="&nbsp;"

}



