$(function(){
	
	// solve active menu problem
	
	switch(menu){
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	
	
	
	 case 'Contact Us':
		$('#contact').addClass('active');
		break;
	
	

	case 'Services':
		$('#service').addClass('active');
		break;
	
	
	case 'Branches':
			$('#branches').addClass('active');
			break;
		
			
	default :
		$('#home').addClass('active');
	   break;
		
	}
});