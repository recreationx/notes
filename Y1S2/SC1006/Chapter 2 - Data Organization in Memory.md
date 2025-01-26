## Role of Memory in Computing
> [!info] Learning Objectives (2.1)
> 1. Describe the concept of programming in software.
> 2. Describe the von Neumann’s stored program concept.
> 3. Describe the role of memory in computing.
> 4. Describe the characteristics and function of different data storage
elements in the memory hierarchy.

### Approaches to Computing
![[Pasted image 20250112173837.png|400]]
![[Pasted image 20250112173850.png|400]]

### Code, Data and Memory
- **Code** is a sequence of instructions.
- **Data** are values these instructions operate on.
- **Memory** is a sequential list of addressable storage elements for storing both instructions and data.

### The Stored Program Concept
- Most modern day computer design are based on von Neumann's stored program concept.
	- Both data and instructions are stored in the same memory
	- Contents of memory are addressable by location, regardless of data type
	- Execution occurs sequentially (unless explicitly modified)

### Memory Hierarchy
Memories are generally organized in levels of increasing speed and cost/bit.
![[Pasted image 20250112174504.png]]

| Type             | Description                                                                                                                                  |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| Registers        | Very fast access but limited numbers within CPU. Operates at CPU clock rate (size: 2-128 registers)                                          |
| Cache memory     | Fast access static RAM closed to CPU. Typical access time 3-20nS (size: up to 512kB) (SRAM)                                                  |
| Main memory      | Usually dynamic RAM or ROM (for program storage). Typical access time 30-70nS. (size: up to 16GB) (DRAM)                                     |
| Secondary memory | Not always random access but non-volatile. Maybe be based on magnetic or flash technology. Typical access time 0.03-100mS. (size: up to 4TB) |
### Characteristics of Main Memory
- **Fix-sized** (typically 8-bit) storage location accessible at high speed in **any-order**
- Each byte-sized (remember 1 byte = 8 bits) location has a unique address that is accessed by specifying its binary pattern on the address bus
- Memory size is dependent on lines in the address bus. (Memory size = 2$^n$ bytes)
- Memory store both **data** and **instructions**. **Consecutive** locations used to store multi-byte data
![[Pasted image 20250112181937.png]]
(aka. if the address bus has 4 lines, then it can select up to 2$^4$ aka 16 address choices, thus the memory size is also 2$^4$ bytes. Addresses begins from 0, thus ends at  2$^n$ - 1)
### Big Endian v Little Endian (byte-ordering)
- Big-endian: MSB comes ordered first in memory
- Little-endian: LSB comes ordered first in memory

![[Pasted image 20250112175808.png|400]]
## Number Representation

| Type                                                                                                         | Characteristics                                                                                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Integer (declared as **int**)<br><br>Either **signed or unsigned** (declared as **int** or **unsigned int**) |                                                                                                                                                                                                                                                     |
| Floating point (declared as **float**)<br><br>**Always signed**                                              | Useful for scientific calculations and has issue of trading off **precision** and **range** for given size (in bits)<br><br>Some CPUs are only integer-based, thus they make us of additional floating point unit (FPU) to support fp computations. |
- Most processors interpret signed numbers using 2's complement. Use unsigned numbers to increase positive range. The **range** can be increased by using more bytes to represent the number.
## Character  Representation
A **char** variable required **one byte** of memory storage. Data is stored in binary but are transformed into characters via encoding standard. The most common encoding standard is the 7-bit **ASCII** code. There are many other character encoding standards - DEC’s Sixbit (6-bit), IBM’s EBCDIC (8-bit) and Unicode (16-bit), etc.

### Encoding Standards
#### ASCII
- American Standard Code for Information Interchange (ASCII)
- 7-bit code
- Lower, upper and digits are contiguous, thus easy to check character's category and transpose cases
- A byte is normally used to store a character, the MSB is then used for parity checking
#### SIXBIT
- DEC's SIXBIT code was popular in the 1960-70s.
- Not used for general text processing - as there is no control characters such as CR (carriage-return) and LF (line-feed). CRLF basically moves the character down to the next line, and to the beginning of that line.
- 6-bit character format was popular with DEC's PDP-8 and PDP-10, which used 18-bit and 36-bit processors.
#### Unicode
- A **8, 16 or 32 bit** character encoding that is downward compatible with ASCII.
## Boolean Representation
Boolean only has 2 states (False = 0, True = non-zero (e.g 1))
- Memory storage for boolean variables is inefficient as most implementation use a byte (minimum memory unit) to store a 1-bit boolean value. Thus processors like the 8051 processor supports **bit-addressable memory**.
## Array, String and Structure Representations
A linear array is a consecutive area in memory storing a series of homogenous data type. Elements of an array are calculated from the **base address (BA)** of the array.
![[Pasted image 20250112182533.png|400]]
For nested arrays, the offset is still calculated from the base address of the array.
![[Pasted image 20250112182718.png|400]]

A string in C is an array of characters that is terminated by a null (0x00) character.
- Alternative is Pascal string, which stores the length of the string at the start of the string. However, this also means that the size of the string can only go up to the size of that length (aka 8-bits for example, thus 255).

For a structure, each data type in a declared structure occupies predefined consecutive locations based on the data type size. Memory space for structure type is only allocated when structure variables are declared.
## Pointer Representation
The value of an pointer is an **address**. Its size is **fixed**, and is determined by the size of the address. Then a 16-bit address (pointer size is thus 2 bytes, and there exist 65536 bytes of memory). The size of the pointer depends on the processor's address range.

![[Pasted image 20250112183602.png|400]]
![[Pasted image 20250112183633.png|400]]
## Data Alignment
- Most computer systems have restrictions on the allowable address for accessing various data types.
- Multi-byte data (e.g. int, double) must be aligned to addresses that are multiple of values such as 2, 4, or 8.
- Programs written with Microsoft (Visual C++) or GNU (gcc) and compiled for a 64-bit Intel processor will use the following data alignment enforcement:
	- ![[Pasted image 20250112183810.png|300]]

![[Pasted image 20250112183857.png|500]]
- Green data can be read in one cycle as Bank Enable can be set to all 0s, aka enabling all banks at once, thus we can read the whole data in one cycle.
- Pink data cannot be read in one cycle, as the first four bytes is misaligned (first four is 0, last four is 1), then the first four must be enabled to be read first, then the last four, resulting in 2 read cycles.