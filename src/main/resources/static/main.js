$(document).ready(function() {
	$("button").click(function() {
		$.ajax({
			type : 'POST',
			url : 'localhost:8080/url/shortner',
			data : JSON.stringify({
				"originalurl" : $("#urlinput").val()
			}),
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				$("#shorturltext").val(data.shorturl);
			}
		});
	});
});