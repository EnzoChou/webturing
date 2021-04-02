/**
 * 
 */
console.log('caricato il file js');

function highlight(e) {
	if (selected[0]) selected[0].className = '';
	console.log('selected', e);
	e.target.parentNode.className = 'selected';
}

var table = document.getElementById('table'),
	selected = table.getElementsByClassName('selected');
table.onclick = highlight;