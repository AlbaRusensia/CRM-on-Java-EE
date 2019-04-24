$(document).ready(function() {

	$('#services_js').change(function(event) {
		var service = $("select#services_js").val();
		$.get('magazin/chage', {
			serviceName : service
		}, function(response) {

			var select = $('#employes_js');
			select.find('option').remove();
			$.each(response, function(index, value) {
				console.log(select);
				$('<option>').val(value.id).text(value.firstName).appendTo(select);
			});
		});
	});
});