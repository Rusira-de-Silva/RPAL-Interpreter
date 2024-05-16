package Parser;

/**
 * The NodeType enum represents the different types of nodes in the RPAL interpreter.
 * Each node type corresponds to a specific token or construct in the RPAL language.
 * The enum values include identifiers, literals, operators, and special keywords.
 */
public enum NodeType {
	let,
	fcn_form,
	identifier,
	integer,
	string,
	where,
	gamma,
	lambda,
	tau,
	rec,
	aug,
	conditional,
	op_or,
	op_and,
	op_not,
	op_compare,
	op_plus,
	op_minus,
	op_neg,
	op_mul,
	op_div,
	op_pow,
	at,
	true_value,
	false_value,
	nil,
	dummy,
	within,
	and,
	equal,
	comma,
	empty_params,
}
