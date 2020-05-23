Ex2.2 Use mesh analysis to find the current I0 in the circuit of Fig. 3.20.

<div align=center><img src="Figure 3.20.png" style="zoom:50%;" />
<center>Figure 3.20</center>

Solution:

Note that V2 at the right bottom side is a current controlled voltage source, the voltage of V2 equals to 4 times I0 as the illustration of Fig. explanation of current controlled voltage source.

<div align=center><img src="explanation of current controlled voltage source.png" style="zoom:50%;" />
<center>Figure3.21 explanation of current controlled voltage source</center>

There are 3 meshes in the circuit as shown down below.

<div align=center><img src="Mesh explanation.png" style="zoom:50%;" />
<center>Figure3.22 Mesh explanation</center>

We apply KVL to the 3 meshes in turn. For mesh 1,
$$
-24 + 10(i1 - i2) +12(i1 - i3) = 0 \\or\\11i1 -5i2 - 6i3= 12
$$
For mesh 2,
$$
-24i2 + 4(i2 - i3) + 10(i2 - i1) = 0 \\or\\-5i1 + 19i2 - 2i3= 0
$$
For mesh 3,
$$
4I0 + 12(i3 - i1) +4(i3 - i2) = 0
$$
As at the top node, I0 = i1 - i2, so that,
$$
4(i1-i2) + 12(i3 - i1) +4(i3 - i2) =0 \\or\\-i1 - i2 +2i3 = 0 
$$
In matrix from all the three equations above, we can get,

$$
\left[\begin{matrix}11&-5&-6\\-5&19&-2\\-1&-1&2\end{matrix} \right] 
\left[\begin{matrix}i1\\i2\\i3\end{matrix}\right] =
\left[\begin{matrix}12\\0\\0\end{matrix}\right]
$$
We calculate the matrix,
$$
i1 =2.25 A \\i2 = 0.75 A \\I0 = i1 -i2 = 1.5 A
$$
