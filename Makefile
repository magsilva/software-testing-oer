all:
	make -C BasicConcepts
	make -C JUnit
	make -C FunctionalTesting
	make -C StructuralTesting
	make -C JaBUTi
	make -C FaultBasedTesting

clean:
	make -C BasicConcepts clean
	make -C JUnit clean
	make -C FunctionalTesting clean
	make -C StructuralTesting clean
	make -C JaBUTi clean
	make -C FaultBasedTesting clean
