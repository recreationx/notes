## Classes of Computer

> [!info] Learning Objectives (1.1)
> - Describe the following class of computers:
> 	- Supercomputers
> 	- Microcomputers
> 	- Embedded systems
> - Describe two early computer architecture designs

- **Supercomputer**
	- Very large, powerful and expensive
	- High computational performance, can operate on large data sizes
	- Generally scalable by adding more processors
	- Used in weather forecasting, simulation of physical systems etc.
	- Example: Titan Supercomputer @ Oak Ridge National Laboratory
- **Microcomputer**
	- Contains a microprocessor as a processing unit, and external memory and peripheral chip support
	- Powerful workstations used as servers, more common variety such as PC and notebooks for home-office
- **Embedded Systems**
	- Compact devices that employ a single-chip (microcontroller) containing the processing unit, memory and relevant peripheral support
### Types of architecture

![[types_of_architecture.png]]

#### Von Neumann Architecture
Many modern computers are still based on von Neumann's design, consisting of
- Central Processing Unit (CPU)
- Memory
- Input and Output (I/O)
![[von_architecture.png]]
## Basic Components of a Microcomputer
> [!info] Learning Objectives (1.2)
> - Describe the basic components of a microcomputer
> - Describe the purpose of the CPU clock and reset circuitry

Consists of three main components: processor, main memory and I/O (input/output) interfaces.
- They are interconnected by a **bus** structure, which consist of a collection of wires through which binary information can be transferred in parallel.
Other important components include the power supply, CPU clock and reset circuitries.
![[parts_of_microcomputer.png]]
#### Clock
- Most computers are **synchronous** and are driven by a master or system **clock**. 
- The **speed performance** of a the computer is governed by the frequency of the clock.
- The CPU requires a fixed number of clock ticks (**cycles**) to execute each instructions. 
- Many **different clock frequencies** are derived from the one master clock. 
- Operations **closer to the CPU core** (such as registers and arithmetic and logic units) are **clocked faster** and those involving **external components** (such as memory or peripheral access) are **clocked slower**.

![[clock_crystal.png]]
#### Reset Circuitry
- CPU is put into a known state on power up. The **reset circuitry** provides an external signal that **asserts** the reset pin when power is applied.
- An active-low signal on the reset pin for a **substantial duration** is required to reset the CPU.
	- We are much slower than machines (machines run on gigahertz), so if we do it so fast, it is still much slower than the processor, thus we need to assert the signal for a number of clock cycle.
- Most computer system provide an additional manual reset button to reset the CPU w/o switching off the power.
- On reset, the CPU is put into a **known initial state** where the boot-up code can execute.
![[reset.png|250]]

## Computer Examples
> [!info] Learning Objectives (1.3)
> - Describe the hardware composition of a desktop PC
> - Describe the hardware composition of a tablet computer

### Major components of a desktop PC/tablet
![[desktop_pc.png|400]]![[ipad2.png|400]]

#### Inside the tablet
![[ipad_board.png|400]]

#### Apple A5 Processor and Benefits of PoP Packaging
- The A5 is a **package on package (PoP)** system-on-a-chip **(SOC)** that was designed by Apple and made by Samsung.
	- ![[pop.png|250]]
- Package on package is an IC packing technique that **vertically stacks** and **interconnect** separate packages (e.g CPU and memory) via **ball grid array (BGA)** connections.
- Some benefits of PoP packaging:
	- **Save space** (reduce size of product)
	- **Minimize track length** between CPU and memory - faster **signal propagation** and **reduced electrical noise**
	- Memory units can be **tested separately** before combining with CPU units - improve manufacturing yield and support multiple memory suppliers
	- **Different-sized memory** can be coupled with CPU based on user requirements - **simplifies inventory control**
	![[a5_processor.png|500]]