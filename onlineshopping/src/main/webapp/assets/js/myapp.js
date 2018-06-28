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
			
			
	case 'All Products':
		$('#listProducts').addClass('active');
		break;			
			
	default :
		$('#listProducts').addClass('active');
	     $('#a-'+ menu).addClass('active');
	   break;
		
	}
});