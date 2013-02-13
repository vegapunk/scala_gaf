package com.vega.gaf.chromosome
import com.vega.gaf.gene.Gene

/**
 * represents a collection of Genes
 */
class Chromosome[T](g:List[Gene[T]]) {
	val genes = g
}

object Chromosome{
	def apply [T](genes:List[Gene[T]]) = {
		new Chromosome(genes)
	}
}