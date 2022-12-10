DSL for Human-Robot Interactive Service Scenarios 
====================================

The repository contains the implementation of a Domain-Specific Language (DSL) to configure human-robot interaction scenarios in service settings.
The DSL constitutes a friendly interface to the model-driven development framework presented in:

- Lestingi, L., Sbrolli, C., Scarmozzino, P., Romeo, G., Bersani, M. M., & Rossi, M. (2022). Formal modeling and verification of multi-robot interactive scenarios in service settings. In FormaliSE 2022 (pp. 80-90). [doi.org/10.1145/3524482.3527653][paper5]
- Lestingi, L., Askarpour, M., Bersani, M. M., & Rossi, M. (2021). A Deployment Framework for Formally Verified Human-Robot Interactions. IEEE Access. [doi.org/10.1109/ACCESS.2021.3117852][paper4]
- Lestingi, L., Askarpour, M., Bersani, M. M., & Rossi, M. (2020, September). *Formal verification of human-robot interaction in healthcare scenarios*. In SEFM 2020 (pp. 303-324). Springer, Cham. [doi.org/10.1007/978-3-030-58768-0_17][paper2]
- Lestingi, L., Askarpour, M., Bersani, M. M., & Rossi, M. (2020). *A Model-driven Approach for the Formal Analysis of Human-Robot Interaction Scenarios*. In SMC 2020 (pp. 1907-1914), IEEE. [doi.org/10.1109/SMC42975.2020.9283204][paper3]
- Lestingi, L., Askarpour, M., Bersani, M. M., & Rossi, M. (2020). *Statistical Model Checking of Human-Robot Interaction Scenarios*. AREA 2020 [doi.org/10.4204/EPTCS.319.2][paper1].

Each scenario features the *layout*, the *humans*, the *robots*, and the *robotic mission*.

The DSL allows the application designer to specify the scenario parameters (e.g., how many humans, their features, the layout shape, etc.). Example DSL files can be found in the [`./hridsl_sources/src`](hridsl_sources/src) folder.

Authors:

| Name              | E-mail address           	 |
|:----------------- |:---------------------------|
| Zerla Davide		| davide.zerla@mail.polimi.it|
| Lestingi Livia    | livia.lestingi@polimi.it   |


Xtext Project Setup
-----------

Install the Eclipse IDE for Java and DSL Developers available [here][eclipse].

Open the repository's root folder as an Eclipse workspace.

Open the the '*Open Projects from File System...*' window and browse to the repository's root folder when selecting the project's source. Make sure that the '*Search for nested projects*' and '*Detect and configure project natures*' options are selected.

**WARNING!** 
Manual creation of empty 'src' and 'xtend-gen' folders might be necessary to solve build errors.
	
Running the DSL IDE
-----------

Right click on the [`./it.polimi.hri_designtime.ide`](it.polimi.hri_designtime.ide) child project and run as 'Eclipse Application'.

Within the newly opened DSL IDE window, select the '*Open Projects from File System...*' window and select [`./hridsl_sources`](hridsl_sources) as a new project's source.

---

*Copyright &copy; 2022 Davide Zerla, Livia Lestingi*

[paper1]: https://doi.org/10.4204/EPTCS.319.2
[paper2]: https://doi.org/10.1007/978-3-030-58768-0_17
[paper3]: https://doi.org/10.1109/SMC42975.2020.9283204
[paper4]: https://doi.org/10.1109/ACCESS.2021.3117852
[paper5]: https://doi.org/10.1145/3524482.3527653
[uppaal]: https://uppaal.org/
[verifyta]: https://docs.uppaal.org/toolsandapi/verifyta/
[eclipse]: https://www.eclipse.org/downloads/packages/release/2022-09/r/eclipse-ide-java-and-dsl-developers
