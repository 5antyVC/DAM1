function calcularIVAgeneral(precio) {
	// body...
	const IVA = 0.21;
	const precioConIVA = precio * (1+IVA);
	return precioConIVA;
}

function calcularIVAreducido(precio) {
	// body...
	const IVA = 0.10;
	const precioConIVA = precio * (1+IVA);
	return precioConIVA;
}

function calcularIVAsuperreducido(precio) {
	// body...
	const IVA = 0.04;
	const precioConIVA = precio * (1+IVA);
	return precioConIVA;
}
function calcularIRPF(precio) {
	// body...
	const IRPF = 0.15;
	const precioConIRPF = precio * (1-IRPF);
	return precioConIRPF;
}
function cinco(precio) {
	// body...
	const percent = 0.05;
	const precioConCinco = precio * (1-percent);
	return precioConCinco;
}