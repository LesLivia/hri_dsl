DSL for Human-Robot Interactive Service Scenarios 
====================================

The repository contains the implementation of a Domain-Specific Language (DSL) to configure human-robot interaction scenarios in service settings.
The DSL constitutes a friendly interface to the model-driven development framework presented in:

- Lestingi, L., Bersani, M. M., & Rossi, M. (2022). Model-Driven Development of Service Robot Applications Dealing with Uncertain Human Behavior. IEEE Intelligent Systems, 37, 1-10. [doi.org/10.1109/MIS.2022.3215698][paper6]

Each scenario features the *layout*, the *humans*, the *robots*, and the *robotic mission*.

The DSL allows the application designer to specify the scenario parameters (e.g., how many humans, their features, the layout shape, etc.). Example DSL files can be found in the [`./hridsl_sources/`](hridsl_sources) folder.

Authors:

| Name              | E-mail address           	 |
|:----------------- |:---------------------------|
| Zerla Davide		| davide.zerla@mail.polimi.it|
| Lestingi Livia    | livia.lestingi@polimi.it   |


Xtext Project Setup
-----------
	
---

*Copyright &copy; 2022 Davide Zerla, Livia Lestingi*

[paper1]: https://doi.org/10.4204/EPTCS.319.2
[paper2]: https://doi.org/10.1007/978-3-030-58768-0_17
[paper3]: https://doi.org/10.1109/SMC42975.2020.9283204
[paper4]: https://doi.org/10.1109/ACCESS.2021.3117852
[paper5]: https://doi.org/10.1145/3524482.3527653
[paper6]: https://doi.org/10.1109/MIS.2022.3215698
[angluin]: https://doi.org/10.1016/0890-5401(87)90052-6
[uppaal]: https://uppaal.org/
[dep]: https://github.com/LesLivia/hri_deployment
[verifyta]: https://docs.uppaal.org/toolsandapi/verifyta/